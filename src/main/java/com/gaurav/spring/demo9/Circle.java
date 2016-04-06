package com.gaurav.spring.demo9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle Center is :" 
				+ " X : " + getCenter().getX() 
				+ " Y : " + getCenter().getY());
		
	}
	
	@PostConstruct
	public void init(){
		System.out.println("@PostConstruct");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("@PreDestroy");
	}

}
