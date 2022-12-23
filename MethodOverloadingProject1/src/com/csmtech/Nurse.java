package com.csmtech;

public class Nurse extends Employee {
	public Nurse(String eName, int eStaffid, int amountYear, double salary, int hours) {
		super(eName, eStaffid, amountYear, salary, hours);
		
	}
	public double getSalary() {
		return salary+5000;
	}
	public void setSalary(double salary) {
		this.salary = salary;

}
	public int salaryIncreased() {
		if(amountYear==oneyear) {
			System.out.println(getSalary()+500);
		}
		
		return salaryIncreased() ;	
	}
}
