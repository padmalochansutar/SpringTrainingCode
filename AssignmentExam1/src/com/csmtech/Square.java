package com.csmtech;

public class Square extends Shape {
	private int side;
	

	public Square(int side) {
		super();
		this.side = side;
	}


	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
