package com.csmtech;

public class Address1 {
	private String houseno;
	private String pincode;
	private String state;
	public Address1(String houseno, String pincode, String state) {
		super();
		this.houseno = houseno;
		this.pincode = pincode;
		this.state = state;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address1 [houseno=" + houseno + ", pincode=" + pincode + ", state=" + state + "]";
	}
	

}
