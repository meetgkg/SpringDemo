package com.gaurav.spring.demo92;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent{

	public MyEvent(Object source) {
		super(source);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Draw Event Occurred -- MyEvent [toString()=" + super.toString() + "]";
	}

}
