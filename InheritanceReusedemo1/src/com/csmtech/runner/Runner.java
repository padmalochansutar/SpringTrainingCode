package com.csmtech.runner;

import com.csmtech.Address1;
import com.csmtech.Employee;

public class Runner {
	public static void main(String[] args) {
		Employee e=new Employee("100", "pl", new Address1("1012", "754140", "odisha"));
		System.out.println(e);
		Address1 a=new Address1("101", "minu","674309");
		System.out.println(a);
	}

}
