package com.csmtech.domain;

public class Member {
     private String name;
     private int    age;
     private double pnumber;
     private String address;
     private double salary;
	public Member(String name, int age, double pnumber, String address,double salary) {
		super();
		this.name = name;
		this.age = age;
		this.pnumber = pnumber;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPnumber() {
		return pnumber;
	}
	public void setPnumber(double pnumber) {
		this.pnumber = pnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", pnumber=" + pnumber + ", address=" + address + ", salary="
				+ salary + "]";
	}
	
     
}
