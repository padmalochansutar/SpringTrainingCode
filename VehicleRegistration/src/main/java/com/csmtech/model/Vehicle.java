package com.csmtech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
@Entity
@Table(name="vehicle")
public class Vehicle implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vehicleid")
	private Long vehicleId;
	
	private String regno;
	
	private String state;
	
	
	@Column(name="extra_image1")
	private String extraImage1;
	
	@Column(name="extra_image2")
	private String extraImage2;
	
	
	
	private Date pvalidity;
	
	private Date fvalidity;
	
	private Date rvalidity;
	

	public Long getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getRegno() {
		return regno;
	}


	public void setRegno(String regno) {
		this.regno = regno;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getExtraImage1() {
		return extraImage1;
	}


	public void setExtraImage1(String extraImage1) {
		this.extraImage1 = extraImage1;
	}


	public String getExtraImage2() {
		return extraImage2;
	}


	public void setExtraImage2(String extraImage2) {
		this.extraImage2 = extraImage2;
	}


	public Date getPvalidity() {
		return pvalidity;
	}


	public void setPvalidity(Date pvalidity) {
		this.pvalidity = pvalidity;
	}


	public Date getFvalidity() {
		return fvalidity;
	}


	public void setFvalidity(Date fvalidity) {
		this.fvalidity = fvalidity;
	}


	public Date getRvalidity() {
		return rvalidity;
	}


	public void setRvalidity(Date rvalidity) {
		this.rvalidity = rvalidity;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", regno=" + regno + ", state=" + state + ", extraImage1="
				+ extraImage1 + ", extraImage2=" + extraImage2 + ", pvalidity=" + pvalidity + ", fvalidity=" + fvalidity
				+ ", rvalidity=" + rvalidity + "]";
	}

	

	
	
	
}
