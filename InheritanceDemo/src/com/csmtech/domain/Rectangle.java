package com.csmtech.domain;

public class Rectangle extends Shape {
	public Rectangle(int width,int height) {//hadcoded values super(5,4);
		super(width,height);
	}
	public int findArea() {
		return getWidth()*getHeight();
	}
	
	
	
	
}
