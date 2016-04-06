package com.gaurav.spring.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp4 {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans4.xml");
		Triangle triangle1 = (Triangle) factory.getBean("triangle1");
		triangle1.draw();
		
		Triangle triangle2 = (Triangle) factory.getBean("triangle2");
		triangle2.draw();
	}

}
