package com.gaurav.spring.demo0;

public class Triangle {
	
	private String type;
	
	public Triangle(String type) {
		super();
		System.out.println("Inside Triangle Constructor");
		this.type = type;
	}
	
	public Triangle() {
		System.out.println("Inside Triangle Default Constructor");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("Inside Triangle Setter");
		this.type = type;
	}
	
	public void draw(){
		System.out.println("Drawing Triangle of type : "+ this.getType());
	}

}
