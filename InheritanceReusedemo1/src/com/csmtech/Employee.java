package com.csmtech;

public class Employee {
    private String eid;
    private String name;
    private Address1 address1;
	public Employee(String eid, String name, Address1 address1) {
		super();
		this.eid = eid;
		this.name = name;
		this.address1 = address1;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address1 getAddress1() {
		return address1;
	}
	public void setAddress1(Address1 address1) {
		this.address1 = address1;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address1=" + address1 + "]";
	}
    
}
