package com.gaurav.cave.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//factory bean and factory method illustrate
		ApplicationContext context = new ClassPathXmlApplicationContext("cavefactory.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.toString());
		Address address = context.getBean("address2", Address.class);
		System.out.println(address.toString());
		
		Logger logger = (Logger)context.getBean("logger");
		
		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");
		

	}

}
