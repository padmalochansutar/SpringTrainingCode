package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="membership")
public class Member implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mid;
	
	private String name;
	
	private Long fees;

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getFees() {
		return fees;
	}

	public void setFees(Long fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	
	
	

}
