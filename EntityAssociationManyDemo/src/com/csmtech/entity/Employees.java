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
@Table(name="employees")
public class Employees implements Serializable {
	@Id
	@Column(name="employee_id")
	private Integer empid;
	@Column(name="last_name")
	private String lastName;
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "manager_id")
	private Employees manager;
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employees getManager() {
		return manager;
	}
	public void setManager(Employees manager) {
		this.manager = manager;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employees [empid=" + empid + ", lastName=" + lastName + ", manager=" + manager + ", department="
				+ department + "]";
	}
	
	

}
