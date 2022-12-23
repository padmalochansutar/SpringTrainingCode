package com.csmtech;

public class Rectangle extends Shape {
       public int findArea() {
    	   return getHeight()*getWeidth();
       }

	@Override
	public String toString() {
		return "Rectangle [findArea()=" + findArea() + ", getHeight()=" + getHeight() + ", getWeidth()=" + getWeidth()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
       
}
