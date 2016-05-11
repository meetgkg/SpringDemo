package com.gaurav.cave.factory2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//factory bean and factory method illustrate
		ApplicationContext context = new ClassPathXmlApplicationContext("cavefactory2.xml");
		Logger logger = (Logger)context.getBean("logger");
		
		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");
		

	}

}
