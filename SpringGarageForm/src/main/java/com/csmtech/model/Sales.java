package com.csmtech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;
@Entity
public class Sales implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer salesId;
	
	private Date salesDate;
	
	private Integer garageId;
	
	private Integer typeId;
	
	private Integer salesQuantity;

	public Integer getSalesId() {
		return salesId;
	}

	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public Integer getGarageId() {
		return garageId;
	}

	public void setGarageId(Integer garageId) {
		this.garageId = garageId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getSalesQuantity() {
		return salesQuantity;
	}

	public void setSalesQuantity(Integer salesQuantity) {
		this.salesQuantity = salesQuantity;
	}

	@Override
	public String toString() {
		return "Sales [salesId=" + salesId + ", salesDate=" + salesDate + ", garageId=" + garageId + ", typeId="
				+ typeId + ", salesQuantity=" + salesQuantity + "]";
	}
	
	
}
