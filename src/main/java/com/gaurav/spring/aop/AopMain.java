package com.gaurav.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurav.spring.aop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-aop.xml");
		
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		
		//shapeService.getCircle().setName("Dummy Circle Name");
		
		shapeService.getCircle().setNameReturn("Dummy Circle");
		
		//System.out.println(shapeService.getTriangle().getName());

	}

}
