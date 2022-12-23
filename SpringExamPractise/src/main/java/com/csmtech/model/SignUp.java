package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SignUp implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer signUpId;
   
   private String name;
   
   private Long mobileNo;
   
   private String emailId;
   
   private String password;

public Integer getSignUpId() {
	return signUpId;
}

public void setSignUpId(Integer signUpId) {
	this.signUpId = signUpId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getMobileNo() {
	return mobileNo;
}

public void setMobileNo(Long mobileNo) {
	this.mobileNo = mobileNo;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "SignUp [signUpId=" + signUpId + ", name=" + name + ", mobileNo=" + mobileNo + ", emailId=" + emailId
			+ ", password=" + password + "]";
}
   
   
   
}
