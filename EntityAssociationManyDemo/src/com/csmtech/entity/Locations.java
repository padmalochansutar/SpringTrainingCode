package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="locations")
public class Locations implements Serializable {
	@Id
	@Column(name="location_id")
	 private Integer locationId;
	@Column(name="city")
	 private String city;
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
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
