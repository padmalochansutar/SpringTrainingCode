package com.csmtech;

public class Employee {
	private int employeeNo;
	private String eName;
	private double esalary;
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public void increaseSalary() {
		double is=getEsalary()*20/100;
		System.out.println(is+"\nincreease salry is: "+(getEsalary()+is));
		
	}
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", eName=" + eName + ", esalary=" + esalary + "]";
	}
	

}
