package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Locations implements Serializable {
	@Id
	@Column(name="location_id")
	private Long locationId;
	
	private String city;

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Locations [locationId=" + locationId + ", city=" + city + "]";
	}
	
	
	

}
