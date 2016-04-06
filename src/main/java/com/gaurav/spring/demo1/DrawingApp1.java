package com.gaurav.spring.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp1 {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans1.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle-name");
		triangle.draw();
	}

}
