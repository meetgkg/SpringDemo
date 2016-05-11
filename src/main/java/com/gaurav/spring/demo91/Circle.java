package com.gaurav.spring.demo91;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
	
	private Center center;
	
	public Center getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Center center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle Center is :" 
				+ " X : " + getCenter().getX() 
				+ " Y : " + getCenter().getY());
		
	}
}
