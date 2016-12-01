package com.aby.record.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.aby.record.model.Record;

public class RecordDao {

	private static SqlSessionFactory sqlSessionFactory;

	public RecordDao(){
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

	@Test
	public void testGetStudent() throws Exception {
		Record record = getRecordByID(341545);
		if (record == null) {
			System.out.println("Null");
		}else {
			System.out.println(record.getPromName());
		}
	}
	
	public static Record getRecordByID(int id){
		SqlSession session = RecordDao.getSqlSessionFactory().openSession();
		RecordMapper mapper = session.getMapper(RecordMapper.class);
		Record record = mapper.selectByPrimaryKey(id);
		session.close();
		return record;
	}
}
