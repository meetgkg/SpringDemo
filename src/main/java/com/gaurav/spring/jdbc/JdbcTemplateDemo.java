package com.gaurav.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-jdbc.xml");
		JdbcTemplateDaoImpl jdbcDaoImpl = ctx.getBean("jdbcTemplateDaoImpl", JdbcTemplateDaoImpl.class);
		
		System.out.println(jdbcDaoImpl.getCircleCount());
	}

}
