package com.csmtech.domain;

public class Rectangle {
       private int length;
       private int breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth(){
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
       public int returnArea() {
    	   return length*breadth;
       }
       public int returnPerimeter() {
    	   return 2*(length+breadth);
       }
       public void display() {
    	   System.out.println("the rectangle of"+returnArea());
    	   System.out.println("the rectangle of"+returnPerimeter());
       }
       
}
