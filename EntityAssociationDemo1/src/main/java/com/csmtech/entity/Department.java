package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="departments")
public class Department implements Serializable {
	
	@Id
	@Column (name = "department_id")
	private Long departmentId;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "location_id")
	private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [location=" + location + "]";
	}
	
	
	

}
