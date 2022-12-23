package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="districts")
public class District implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="districts_id")
	private Long districtsId;
	
	private String name;

	public Long getDistrictsId() {
		return districtsId;
	}

	public void setDistrictsId(Long districtsId) {
		this.districtsId = districtsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "District [districtsId=" + districtsId + ", name=" + name + "]";
	}

	
	

}
