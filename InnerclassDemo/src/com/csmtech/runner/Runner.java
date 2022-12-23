package com.csmtech.runner;

import com.csmtech.Car;

public class Runner {

	public static void main(String[] args) {
		/*
		 * Car car=new Car("blue"); //car.new Engine().start(); Car.Engine e=car.new
		 * Engine(); e.start(); System.out.println(car.getColor());
		 */
		/*
		 * Car.Engine.Piston p=new Car("blue").new Engine().new Piston();//aggregation
		 * p.movePiston(); Car car=new Car("blue"); System.out.println(car.getColor());
		 */
		Car.Engine e=new Car("blue").new Engine("black");
		e.start();
		Car car=new Car("red");
		System.out.println(car.getColor());
		}
	
	

}
