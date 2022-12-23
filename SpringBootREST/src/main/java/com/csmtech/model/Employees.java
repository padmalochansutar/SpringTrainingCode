package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;
@Entity
public class Employees implements Serializable {
	
	@Id
	@Column(name="employee_id")
	private Integer employeeId;
	@Column(name="last_name")
	private String lastName;
	
	private Double salary;
	
	private Integer departmentId;

	

	public Employees(Integer employeeId, String lastName, Double salary) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.salary = salary;
		
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", lastName=" + lastName + ", salary=" + salary
				+ ", departmentId=" + departmentId + "]";
	}
	
	

	

}
