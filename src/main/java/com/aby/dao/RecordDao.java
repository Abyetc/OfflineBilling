package com.aby.dao;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.SeekableByteChannel;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.drools.compiler.lang.dsl.DSLMapParser.statement_return;
import org.eclipse.jdt.internal.compiler.util.Sorting;
import org.junit.Test;

import com.aby.mapping.BillMapper;
import com.aby.mapping.RecordMapper;
import com.aby.model.Bill;
import com.aby.model.BillKey;
import com.aby.model.Record;

public class RecordDao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		System.out.print("Original PROM_NUM: ");
		String originalPackageNum = sc.next();
		System.out.println();
		System.out.print("New PROM_NUM: ");
		String newPackageNum = sc.next();
		System.out.println();
		reBilling2(originalPackageNum, newPackageNum);
	}

	private static SqlSessionFactory sqlSessionFactory;

	public RecordDao() {
		sqlSessionFactory = getSqlSessionFactory();
	}

	// 使用单例模式管理sqlSessionFactory
	public static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			synchronized (RecordDao.class) {
				if (sqlSessionFactory == null) {
					InputStream inputStream = null;
					try {
						inputStream = Resources.getResourceAsStream("mybatis.xml");
						sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
					} catch (IOException e) {
						throw new RuntimeException(e.getCause());
					} finally {
						try {
							inputStream.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		return sqlSessionFactory;
	}

	public static SqlSession openSession() {
		return getSqlSessionFactory().openSession();
	}

	/**
	 * 读取数据库中关于原先套餐的所有记录，然后在新套餐规则下进行重新计费，然后将重新计算的结果插入数据库
	 * 
	 * @param originalPackageNum
	 * @param newPackageNum
	 * @return 总共处理了多少条记录
	 */
	public static int reBilling(String originalPackageNum, String newPackageNum) {
		List<Integer> list = getIDs(originalPackageNum); // 获取原先套餐的所有记录的ID
		int size = list.size();
		int capacity = 1000; // 每次处理1000个记录，这个数量可以修改，暂时用1000
		int index = 0;
		while (index < size) {
			List<Record> records = new LinkedList<Record>();
			for (int i = index; i < index + capacity && i < size; i++) {
				int id = list.get(index);
				Record record = getRecordByID(id);
				records.add(record);
			}

			index += capacity;
			fireRule(records, newPackageNum);
			List<Bill> bills = new LinkedList<Bill>();
			for (Record record : records) {
				Bill bill = Bill.getBillFromRecord(record);
				bills.add(bill);
			}
			// 将得到的新数据插入到数据库中
			insertBillBatch(bills);
			System.out.println(index);
		}
		return size;
	}

	public static int reBilling2(String originalPackageNum, String newPackageNum) {
		long begin = System.currentTimeMillis();
		List<Record> records = getRecordsByPackageNum(originalPackageNum);
		long end = System.currentTimeMillis();
		System.out.println("Query time: " + (end - begin) / 1000 + "s");

		int size = records.size();
		System.out.println("Total items: " + size);
		if (size == 0) {
			return 0;
		}

		int index = 0;
		int capacity = 1000;
		long b = System.currentTimeMillis();
		while (index < size) {
			List<Record> tmpRecord = new LinkedList<Record>();
			for (int i = index; i < index + capacity && i < size; i++) {
				tmpRecord.add(records.get(i));
			}
			fireRule(tmpRecord, newPackageNum);
			index += capacity;

			List<Bill> bills = new LinkedList<Bill>();
			for (Record record : tmpRecord) {
				Bill bill = Bill.getBillFromRecord(record);
				bills.add(bill);
			}
			// 将得到的新数据插入到数据库中
			insertBillBatch(bills);
		}
		long e = System.currentTimeMillis();
		System.out.println("Deal Time: " + (e - b) / 1000 + "s");
		System.out.println("Finish!");

		return size;
	}

	/**
	 * 将列表中的所有记录匹配规则文件中给定的规则套餐
	 * 
	 * @param list
	 * @param newPackageNum
	 */
	private static void fireRule(List<Record> list, String newPackageNum) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");
			for (Record record : list) {
				record.setPromNum(newPackageNum);
				kSession.insert(record);
			}
			kSession.fireAllRules();

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	@Test
	public void testGetStudent() throws Exception {
		reBilling2("2-U33YJHZ", "2-U33YJHZ");
	}

	public static Record getRecordByID(int id) {
		SqlSession session = RecordDao.getSqlSessionFactory().openSession();
		RecordMapper mapper = session.getMapper(RecordMapper.class);
		Record record = mapper.selectByPrimaryKey(id);
		session.close();
		return record;
	}

	public static void insertBill(Bill bill) {
		SqlSession session = RecordDao.getSqlSessionFactory().openSession();
		BillMapper mapper = session.getMapper(BillMapper.class);
		mapper.insert(bill);
		session.commit();
		session.close();
	}

	public static void insertBillBatch(List<Bill> bills) {
		SqlSession session = RecordDao.getSqlSessionFactory().openSession();
		BillMapper mapper = session.getMapper(BillMapper.class);
		mapper.insertBatch(bills);
		session.commit();
		session.close();
	}

	public static List<Integer> getIDs(String packageNum) {
		SqlSession session = RecordDao.getSqlSessionFactory().openSession();
		RecordMapper mapper = session.getMapper(RecordMapper.class);
		List<Integer> list = mapper.selectIDs(packageNum);
		return list;
	}

	public static List<Record> getRecordsByPackageNum(String packageNum) {
		SqlSession session = RecordDao.getSqlSessionFactory().openSession();
		RecordMapper mapper = session.getMapper(RecordMapper.class);
		List<Record> list = mapper.selectByPackageNum(packageNum);
		return list;
	}
}
