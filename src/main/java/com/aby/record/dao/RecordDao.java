package com.aby.record.dao;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.aby.record.model.Record;

public class RecordDao {
	@Test
	public void testGetStudent() throws Exception {
		// 1. 加载MyBatis的配置文件：mybatis.xml（它也加载关联的映射文件，也就是mappers结点下的映射文件）
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("mybatis.xml");
		// 2. SqlSessionFactoryBuidler实例将通过输入流调用build方法来构建 SqlSession 工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		// 3. 通过工厂获取 SqlSession 实例，SqlSession 完全包含了面向数据库执行 SQL 命令所需的所有方法。
		SqlSession session = sqlSessionFactory.openSession();
		// 4. 准备基本信息
		
		RecordMapper mapper = session.getMapper(RecordMapper.class);
		Record record = mapper.selectByPrimaryKey(341545);
//		System.out.println(record);
//		System.out.println(record.getTotalAmt());
//		System.out.println(record.getTotalRentalAmt());
		System.out.println(record.getPromName());
		// 6. 关闭输入流和SqlSession实例
		in.close();
		session.close();
	}
}
