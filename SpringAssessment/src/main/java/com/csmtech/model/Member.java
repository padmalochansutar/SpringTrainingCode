package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="memberdetails")
public class Member implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name=" membershipid")
	private Long membershipid;
	
	private String name;
	
	private String type;
	
	private Long mobileno;
	
	private String fathersname;
	
	private String address;
	
	private String gender;
	
	private Long age;
	
	

	public Long getMembershipid() {
		return membershipid;
	}



	public void setMembershipid(Long membershipid) {
		this.membershipid = membershipid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public Long getMobileno() {
		return mobileno;
	}



	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}



	public String getFathersname() {
		return fathersname;
	}



	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Long getAge() {
		return age;
	}



	public void setAge(Long age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Member [membershipid=" + membershipid + ", name=" + name + ", type=" + type + ", mobileno=" + mobileno
				+ ", fathersname=" + fathersname + ", address=" + address + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	
	
	

}
