package com.csmtech.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
public class Region {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long Id;
	String name;
	
	
}
