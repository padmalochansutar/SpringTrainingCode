package com.csmtech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
public class Registration implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer registrationId;

	
	private String applicantName;
    
	
	private String email;

	
	private Long mobileNo;
	
    private Integer age;

	private String idProof;

	 @ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "collegeId")
	private  College college;
	
	 @ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "branchId")
	private Branch branch;
	 
	 private String isDelete;

	public Integer getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "Registration [registrationId=" + registrationId + ", applicantName=" + applicantName + ", email="
				+ email + ", mobileNo=" + mobileNo + ", age=" + age + ", idProof=" + idProof + ", college=" + college
				+ ", branch=" + branch + ", isDelete=" + isDelete + "]";
	}

	

}
