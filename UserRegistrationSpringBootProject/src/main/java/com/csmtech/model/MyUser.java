package com.csmtech.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="my_user")
public class MyUser implements Serializable {
	@Id
	@SequenceGenerator(name="user_seq_gen", sequenceName = "my_user_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator= "user_seq_gen")
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="name")
	private String userName;
	
	private String email;
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="my_user_my_role",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
	private List<MyRole> myRole;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public List<MyRole> getMyRole() {
		return myRole;
	}

	public void setMyRole(List<MyRole> myRole) {
		this.myRole = myRole;
	}

	@Override
	public String toString() {
		return "MyUser [userId=" + userId + ", userName=" + userName + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", isActive=" + isActive + ", myRole=" + myRole + "]";
	}
	

	
	

}
