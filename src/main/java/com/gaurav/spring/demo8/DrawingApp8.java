package com.gaurav.spring.demo8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp8 {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans8.xml");
		//Shape shape1 = (Triangle) factory.getBean("triangle");
		//shape1.draw();
		
		Shape shape = (Circle) factory.getBean("circle");
		shape.draw();
	}

}
