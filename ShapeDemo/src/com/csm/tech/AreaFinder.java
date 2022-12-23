package com.csm.tech;

public class AreaFinder {
	private Shape shape;
	public AreaFinder(Shape shape) {
		this.shape=shape;
	}
	public void getArea() {
		System.out.println(shape.findArea());
	}

}
