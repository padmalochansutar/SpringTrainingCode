package com.csmtech.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
@Table(name = "tempreg")
public class TempReg {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 Long regid;
	  String facultyname;
	  String facultyaddress;
	  String status;
	  Long id;
}
