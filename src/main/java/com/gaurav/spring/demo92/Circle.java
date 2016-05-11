package com.gaurav.spring.demo92;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{
	
	private Point center;
	
	private ApplicationEventPublisher publisher;
	
	public Point getCenter() {
		return center;
	}
	
	/*@Autowired
	public void setPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}*/



	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		
		publisher.publishEvent(new MyEvent(this));
		
		System.out.println("Circle Center is :" 
				+ " X : " + getCenter().getX() 
				+ " Y : " + getCenter().getY());
		
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}
