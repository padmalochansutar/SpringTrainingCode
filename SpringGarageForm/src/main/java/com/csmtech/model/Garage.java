package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Garage implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer garageId;
	
	private String garageName;
	
	private String address;

	public Integer getGarageId() {
		return garageId;
	}

	public void setGarageId(Integer garageId) {
		this.garageId = garageId;
	}

	public String getGarageName() {
		return garageName;
	}

	public void setGarageName(String garageName) {
		this.garageName = garageName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Garage [garageId=" + garageId + ", garageName=" + garageName + ", address=" + address + "]";
	}

	
}
