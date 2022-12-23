package com.csmtech.model;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNullApi;



public class User implements Serializable {
	

	@NotEmpty(message = "user id must not be an empty")
	@NotNull(message = "user id not null")
	private String userId;
	
	//@Pattern(regexp =" ^.*(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",message = "check pasword properly")
	private String password;
	
	@Min(value=18, message = "Age should be minimum 18")
	@Max(value=60, message = "Age should be maximum 60")
	private Integer age;
	
	@Email(message = "check your email properly")
	private String eMail;
	@Size(max=10,min=10,message = " give valid phoneno ")
	private String phoneNo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", age=" + age + ", eMail=" + eMail + ", phoneNo="
				+ phoneNo + "]";
	}

	
}
