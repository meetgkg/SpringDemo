package com.gaurav.spring.demo2;

import java.util.List;

public class Triangle {
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw(){
		
		System.out.println("Triangle Details : ");
		for(Point t : points){
			System.out.println("X : " + t.getX() + ", Y : " + t.getY() );
		}
	}

}
