package com.csmtech.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString


public class Registation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  Long regid;
  String facultyname;
  String facultyaddress;
  String status;
  Long id;
  
}
