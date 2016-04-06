package com.gaurav.spring.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp2 {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans2.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
