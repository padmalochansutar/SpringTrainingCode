package com.csmtech.domain;

public class Employee extends Member  {
    private String email;
    private String department;
	public Employee(String name, int age, double pnumber, String address, double salary, String email,
			String department) {
		super(name, age, pnumber, address, salary);
		this.email = email;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [email=" + email + ", department=" + department + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getPnumber()=" + getPnumber() + ", getAddress()=" + getAddress() + ", getSalary()="
				+ getSalary() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
    
	
	
	
	}
    

