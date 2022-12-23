package com.csmtech.controller;

import com.csmtech.Employee;
import com.csmtech.Teacher;

public class EmployeeController {
	public static void main(String[] args) {
		Employee e=new Teacher("rajat", 101, 2,55000, 40, "developer");
		System.out.println(e.getSalary());
	  
	}

}
