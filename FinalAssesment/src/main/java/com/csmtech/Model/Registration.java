package com.csmtech.Model;

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
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="registration_detail")
public class Registration implements Serializable {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="registration_id")
	private Integer registrationid;
	
	@Column(name="applicant_name")
	private String name;
	
	@Column(name="email_id")
	private String email;
	
	@Column(name="mobile_no")
	private String mobile;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="imagepath")
	private String image;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="providerid")
//	@Column(name="provider_id")
	private Provider provider_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="connectionid")
//	@Column(name="connection_id")
	private Connection connection_id;
}
