package com.csmtech.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="departments")
public class Department implements Serializable {
	@Id
	@Column(name="department_id")
	private Integer departmentId;
	@ManyToOne
	@JoinColumn(name="location_id")
	private Locations locations;
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Locations getLocations() {
		return locations;
	}
	public void setLocations(Locations locations) {
		this.locations = locations;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + "]";
	}
	
	

}
