package com.csmtech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registration_master")
public class Registration implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "registration_id")
	private Integer registrationId;

	@Column(name = "applicant_name")
	private String applicantName;
    
	@Column(name="email_id")
	private String email;

	@Column(name = "mobile_no")
	private String mobileNo;
	
	private String gender;

	private Date dob;
    
	private Integer age;

	@Column(name = "image_path")
	private String idProof;

	 @ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "library_id")
	private Library library;
	
	 @ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "subscription_id")
	private Subscription subscription;
	 
	@Column(name="is_delete")
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
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
				+ email + ", mobileNo=" + mobileNo + ", gender=" + gender + ", dob=" + dob + ", age=" + age
				+ ", idProof=" + idProof + ", library=" + library + ", subscription=" + subscription + ", isDelete="
				+ isDelete + "]";
	}

	
	

	

	
	
	

}
