package com.gaurav.spring.demo91;

import org.springframework.stereotype.Component;

@Component
public class Center {
	private int x = 100;
	private int y = 200;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
