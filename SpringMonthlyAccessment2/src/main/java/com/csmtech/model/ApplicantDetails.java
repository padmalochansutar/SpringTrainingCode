package com.csmtech.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class ApplicantDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer applicantId;
	private String name;
	private String mailId;
	private String mobileNumber;
	private Date dateOfBirth;
	private String gender;
	
	private String file;
	@ManyToOne
	@JoinColumn(name="providerId")
	private ServiceProvider serviceProvider;
	@ManyToOne
	@JoinColumn(name="connectionId")
	private ConnectionSpeed connectionSpeed;
	

}
