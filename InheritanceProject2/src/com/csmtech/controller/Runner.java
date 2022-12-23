package com.csmtech.controller;

import com.csmtech.domain.Employee;
import com.csmtech.domain.Manager;
import com.csmtech.domain.Member;

public class Runner {
  public static void main(String[] args) {
	Employee e=new Employee("rajat", 18, 987654, "bbsr", 20000, "rajat@123","mca");
    Manager m=new Manager("santosh", 19, 897654, "khorda", 30000, "santosh@123","mba");
	System.out.println(e);
    System.out.println(m);
  }
  
}
