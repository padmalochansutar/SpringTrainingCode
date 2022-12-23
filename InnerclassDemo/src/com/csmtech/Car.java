package com.csmtech;

public class Car {//outer class
	private String color;
	private int power=100;
	public Car(String color) {
		this.color=color;
	}
public class Engine{//inner class
	private String color;
	public Engine(String color) {
		this.color=color;
	}
	public class Piston{
		public void movePiston() {
			System.out.println("piston is moving"+power);
		}
	}
	
		public void start() {
			System.out.println(color+" Engine starts");//naming colison inner class properties priority
		}
}
public String getColor() {
	return color;
}
}
