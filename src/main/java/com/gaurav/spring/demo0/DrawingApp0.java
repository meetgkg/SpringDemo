package com.gaurav.spring.demo0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp0 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans0.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
		
		Triangle triangle1 = (Triangle) factory.getBean("triangle1");
		triangle1.draw();
	}

}
