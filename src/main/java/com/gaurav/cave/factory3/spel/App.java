package com.gaurav.cave.factory3.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cavespel.xml");
		Robot robot = (Robot)context.getBean("robot");
		
		robot.speak();
	}

}
