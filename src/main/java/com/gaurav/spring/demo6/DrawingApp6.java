package com.gaurav.spring.demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp6 {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans6.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
