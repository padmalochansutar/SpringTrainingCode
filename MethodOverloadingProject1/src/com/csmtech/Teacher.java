package com.csmtech;

public class Teacher extends Employee {
       private String department;

	public Teacher(String eName, int eStaffid, int amountYear, double salary, int hours, String department) {
		super(eName, eStaffid, amountYear, salary, hours);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		  return getSalary()+1000;
		
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
		
			
	}

	
	
	

