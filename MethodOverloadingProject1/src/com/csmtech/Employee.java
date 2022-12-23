package com.csmtech;

public class Employee {
	private String eName;
	private int eStaffid;
	public int amountYear;
	public static double salary=55000;
	public static int hours=40;
	public static int oneyear=365;
	public Employee(String eName, int eStaffid, int amountYear,double salary,int hours) {
		super();
		this.eName = eName;
		this.eStaffid = eStaffid;
		this.amountYear = amountYear;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteStaffid() {
		return eStaffid;
	}
	public void seteStaffid(int eStaffid) {
		this.eStaffid = eStaffid;
	}
	public int getAmountYear() {
		return amountYear;
	}
	public int setAmountYear(int amountYear) {
		return this.amountYear = amountYear;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public boolean inTenure() {
		if(amountYear>=4) {} 
			return true;
		}
	
	
	

}
