package com.csmtech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity

public class Registation implements Serializable {
	
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer registationId ;
     
     private String applicantName;
     
     private String emailId;
     
     private Long mobileNo;
     
     
     private String gender;
     
     
     private Date dob;
     
     
     private String image;
     @ManyToOne
     @JoinColumn(name="collegeId")
     private College college;
    @ManyToOne
    @JoinColumn(name="branchId")
     private Branch branch;

	public Integer getRegistationId() {
		return registationId;
	}

	public void setRegistationId(Integer registationId) {
		this.registationId = registationId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	@Override
	public String toString() {
		return "Registation [registationId=" + registationId + ", applicantName=" + applicantName + ", emailId="
				+ emailId + ", mobileNo=" + mobileNo + ", gender=" + gender + ", dob=" + dob + ", image=" + image
				+ ", college=" + college + ", branch=" + branch + "]";
	}
     
     
     

	
	
}
