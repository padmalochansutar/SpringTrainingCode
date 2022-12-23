package com.csmtech.domain;

public class Address {
      public String hno;
      private String lane;
      private String zip;
	public Address(String houseNo, String lane, String zip) {
		super();
		this.hno = houseNo;
		this.lane = lane;
		this.zip = zip;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", lane=" + lane + ", zip=" + zip + "]";
	}
     
}
