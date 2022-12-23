package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
public class Location implements Serializable {
	@Id
	@Column (name = "location_id")
	private Long locationsId;
	

	private String city;
	
	

	public Long getLocationsId() {
		return locationsId;
	}



	public void setLocationsId(Long locationsId) {
		this.locationsId = locationsId;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Location [locationsId=" + locationsId + ", city=" + city + "]";
	}
	
	
	
	
	

}
