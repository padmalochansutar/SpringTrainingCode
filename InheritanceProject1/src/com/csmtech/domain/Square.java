package com.csmtech.domain;

public class Square extends Rectangle {
       public Square(int length,int breadth) {
    	   super(length,breadth);
       }
       public int returnArea() {
    	   return getLength()*getBreadth();
       }
       public int returnPerimeter() {
    	   return 4*getLength();
       }
       public void display1() {
    	   System.out.println("the square of"+returnArea());
    	   System.out.println("the square of"+returnPerimeter());
       }
}
