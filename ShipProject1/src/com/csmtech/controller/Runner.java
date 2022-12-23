package com.csmtech.controller;

import java.lang.reflect.Array;

import com.csmtech.CargoShip;
import com.csmtech.CruiseShip;

public class Runner {

	public static void main(String[] args) {
          String[] array=new String[3];
          array[0]="Ship";
          array[1]="CargoShip";
          array[2]="CruiseShip";
          System.out.println(new CargoShip(array[1], "2021", 15));
          System.out.println(new CruiseShip(array[2], "2023", 20));
	}

}
