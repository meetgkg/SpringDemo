package com.gaurav.spring.demo5;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
//public class Triangle{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean - Initializing Bean");
	}

	public void destroy() throws Exception {
		System.out.println("DisposableBean - Destroying Bean");		
	}
	
	public void myInit() throws Exception {
		System.out.println("XML - Initializing Bean");
	}

	public void myDestroy() throws Exception {
		System.out.println("XML -Destroying Bean");		
	}

}
