package com.csm.tech;

public class Rectangle extends Shape {
   private double height;
   private double width;
   

public Rectangle(double height, double width) {

	this.height = height;
	this.width = width;
}
@Override

public double findArea() {
	// TODO Auto-generated method stub
	return height*width ;
}
}
