package com.csmtech.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String mobile;
	private String dob;
	private String gender;
	private String upload;
	@ManyToOne
	@JoinColumn(name = "proid")
	private Provider provider;
	@ManyToOne
	@JoinColumn(name = "subid")
	private Subscriptiontime subscriptiontime;

}
