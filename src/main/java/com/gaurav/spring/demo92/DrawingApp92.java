package com.gaurav.spring.demo92;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp92 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans92.xml");
		Shape shape = (Shape) factory.getBean("circle");
		shape.draw();
	}

}
