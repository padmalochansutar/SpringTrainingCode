package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="departments")
public class Department implements Serializable {
	@Id
	@Column(name="department_id")
	private Long departmentId;
	@Column(name="department_name")
	private String departmentName;
	
	@ManyToOne
	@JoinColumn(name="location_id")
	private Locations locations;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Locations getLocations() {
		return locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", locations="
				+ locations + "]";
	}
	
	
	
	
}
