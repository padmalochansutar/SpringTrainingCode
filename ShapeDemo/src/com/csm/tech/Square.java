package com.csm.tech;

public class Square extends Shape {
	
     private double side;
    
     
	public Square(double side) {
		
		this.side = side;
	}

	public double findArea() {
		// TODO Auto-generated method stub
		return side*side ;
	}

}
