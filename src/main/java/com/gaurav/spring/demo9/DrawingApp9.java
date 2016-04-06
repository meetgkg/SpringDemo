package com.gaurav.spring.demo9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp9 {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("beans9.xml");
		//Shape shape1 = (Triangle) factory.getBean("triangle");
		//shape1.draw();
		factory.registerShutdownHook();
		Shape shape = (Circle) factory.getBean("circle");
		shape.draw();
	}

}
