package com.csmtech.model;


import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Register{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "regId")
	private Integer regId;
	private String fname;
	private String lname;
	private String faname;
	private String gender;
	private String email;
	private Long number;
	private String address;
	private Long pincode;
	private Integer age;
	private String quals;
	public Integer getRegId() {
		return regId;
	}
	public void setRegId(Integer regId) {
		this.regId = regId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFaname() {
		return faname;
	}
	public void setFaname(String faname) {
		this.faname = faname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public String getQuals() {
		return quals;
	}
	public void setQuals(String quals) {
		this.quals = quals;
	}
	@Override
	public String toString() {
		return "Register [regId=" + regId + ", fname=" + fname + ", lname=" + lname + ", faname=" + faname + ", gender="
				+ gender + ", email=" + email + ", number=" + number + ", address=" + address + ", pincode=" + pincode
				+ ", age=" + age + ", quals=" + quals + "]";
	}
	
	
	
	

}
