package com.csm.tech;

public class Circle extends Shape {
      private double radious;
     
	public Circle(double radious) {
		
		this.radious = radious;
	}
    
	@Override
	public
	double findArea() {
		// TODO Auto-generated method stub
		return Math.PI*radious*radious;
	}
	

}
