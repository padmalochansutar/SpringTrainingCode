package com.csmtech.domain;

public class Shape {
	
	private int width;
	private int height;
	
	
	 public Shape(int width, int height) { 
		 this.width = width; 
		 this.height =height;
		 }
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {//to reinitialize of instance properties
		this.height = height;
	}

	@Override
	public String toString() {//currently object what instance properties hold
		return "Shape [width=" + width + ", height=" + height + "]";
	}
	
	
	
	

}
