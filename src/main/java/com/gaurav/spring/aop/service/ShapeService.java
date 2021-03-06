package com.gaurav.spring.aop.service;

import com.gaurav.spring.aop.aspects.Loggable;
import com.gaurav.spring.aop.model.Circle;
import com.gaurav.spring.aop.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
