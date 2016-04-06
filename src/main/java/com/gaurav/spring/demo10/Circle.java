package com.gaurav.spring.demo10;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{
	
	private Point center;
	
	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	public Point getCenter() {
		return center;
	}
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void draw() {
		System.out.println(getMessageSource().getMessage("drawing.circle", new Object[]{center.getX(), center.getY()}, "Default Greeting" , Locale.ENGLISH));
		
		System.out.println(getMessageSource().getMessage("drawing.circle", new Object[]{center.getX(), center.getY()}, "Default Greeting" , Locale.ITALIAN));
		
		System.out.println(getMessageSource().getMessage("greetings", null, "Default Greeting" , null));
		
		//Creating my own event
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		
	}
	
	@PostConstruct
	public void init(){
		System.out.println("@PostConstruct");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("@PreDestroy");
	}
	
	//This method will be used by Spring so that we can get publisher obj
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

}
