package com.gaurav.spring.demo7;

public class Circle implements Shape{
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle Center is : X : " + getCenter().getX() + " Y : " + getCenter().getY());
		
	}

}
