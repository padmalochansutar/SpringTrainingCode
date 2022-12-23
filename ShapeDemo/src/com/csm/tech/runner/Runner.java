package com.csm.tech.runner;

import com.csm.tech.AreaFinder;
import com.csm.tech.Circle;
import com.csm.tech.Rectangle;
import com.csm.tech.Shape;
import com.csm.tech.Square;

public class Runner {
 public static void main(String[]args) {
		/*
		 * Shape s=new Rectangle(5, 4); System.out.println("The area is "+s.findArea());
		 * s=new Square(5); System.out.println("The area is "+s.findArea()); s=new
		 * Circle(5); System.out.println("The area is "+s.findArea());
		 */
	  AreaFinder areafinder=new AreaFinder (new Circle(5));
	  areafinder.getArea();
 }
}
