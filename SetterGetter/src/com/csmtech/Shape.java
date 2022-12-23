package com.csmtech;

public class Shape {
     private int height;
     private int weidth;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeidth() {
		return weidth;
	}
	public void setWeidth(int weidth) {
		this.weidth = weidth;
	}
	@Override
	public String toString() {
		return "Shape [height=" + height + ", weidth=" + weidth + "]";
	}
     
}
