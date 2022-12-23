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
@Table (name = "employees")
public class Employees implements Serializable {
	@Id
	@Column (name = "employee_id")
	private  Long empId;
	
	@Column (name="last_name")
	private String lastName;
	
//	@Column (name="manager_id")
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "manager_id")
	private Employees managerId;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "department_id")
	private Department department;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public Employees getManagerId() {
		return managerId;
	}

	public void setManagerId(Employees managerId) {
		this.managerId = managerId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", lastName=" + lastName + ", managerId=" + managerId + ", department="
				+ department + "]";
	}
	

	

	
	
	

	

}
