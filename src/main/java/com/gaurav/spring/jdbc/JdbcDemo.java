package com.gaurav.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-jdbc.xml");
		JdbcDaoImpl jdbcDaoImpl = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		//Circle circle = jdbcDaoImpl.getCircle(1);
		System.out.println(jdbcDaoImpl.getCircleCount());
		
		System.out.println(jdbcDaoImpl.getCircleName(1));
		
		System.out.println(jdbcDaoImpl.getCircleForId(1).getName());
		
		Circle circle = new Circle(3, "Third Circle");
		jdbcDaoImpl.insertCircle(circle);
		
		Circle circle2 = new Circle(4, "Fourth Circle");
		jdbcDaoImpl.insertCircleNamedParam(circle2);
		
		System.out.println(jdbcDaoImpl.getAllCircles().size());
		
	}

}
