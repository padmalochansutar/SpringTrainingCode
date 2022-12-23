package com.csmtech.domain;

import com.csmtech.controller.Address;
import com.csmtech.controller.Employee;

public class Runner {
  public static void main(String[] args) {
	Employee e=new Employee("101","Bismaya",50000,new Address("10", "754140", "Odisha"));
	System.out.println(e);
}
}
