package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.csmtech.service.UserService;
@Entity
@Table(name="user")
public class User implements Serializable {
	@Id
	@Column(name="userid")
	private String userId;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="phone")
	private Long phone;
	@Column(name="email")
	private String email;
	@Column(name="type")
	private String type;
	@Column(name="password")
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String  userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", type=" + type + ", password=" + password + "]";
	}
	
	
	

}
