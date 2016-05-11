package com.gaurav.spring.demo91;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp91 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans91.xml");
		Shape shape = (Shape) factory.getBean("circle");
		shape.draw();
	}

}
