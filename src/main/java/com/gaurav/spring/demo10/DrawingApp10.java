package com.gaurav.spring.demo10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp10 {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("beans10.xml");
		//Shape shape1 = (Triangle) context.getBean("triangle");
		//shape1.draw();
		//context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		/*String message = context.getMessage("greetings", null, "Default Greeting" , null);
		System.out.println(message);*/
	}

}
