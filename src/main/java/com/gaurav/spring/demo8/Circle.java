package com.gaurav.spring.demo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}

	@Required
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle Center is :" 
				+ " X : " + getCenter().getX() 
				+ " Y : " + getCenter().getY());
		
	}

}
