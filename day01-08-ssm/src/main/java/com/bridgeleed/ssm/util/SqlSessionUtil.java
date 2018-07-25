package com.bridgeleed.ssm.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	private static SqlSessionFactory sessionFactory;
	static {
		InputStream in = SqlSessionUtil.class.getClassLoader().getResourceAsStream("SqlMapperConfig.xml");
		sessionFactory = new SqlSessionFactoryBuilder().build(in);

	}

	public static SqlSession getSession(){
		return sessionFactory.openSession();
	}

}
