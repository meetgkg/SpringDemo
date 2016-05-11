package com.gaurav.spring.demo3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware{
	
	public Triangle(){
		//System.out.println("Triangle Constructor");
	}
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("Triangle Details : \n"
				+ "X : " + this.getPointA().getX() + ", Y : " + this.getPointA().getY() + "\n"
				+ "X : " + this.getPointB().getX() + ", Y : " + this.getPointB().getY() + "\n"
				+ "X : " + this.getPointC().getX() + ", Y : " + this.getPointC().getY() 
				);
		
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		//System.out.println("Application Context Aware Set");
		this.context = context;
	}

}
