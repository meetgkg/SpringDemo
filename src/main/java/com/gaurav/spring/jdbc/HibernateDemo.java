package com.gaurav.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-jdbc.xml");
		HibernateDaoImpl hibernateDaoImpl = ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		
		System.out.println(hibernateDaoImpl.getCircleCount());
	}

}
