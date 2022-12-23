package com.csmtech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Employees implements Serializable {
	
	@Id
	@Column(name="employee_id")
	private Long employeeId;
	@Column(name="last_name")
	private String lastName;
	
	private Double salary;
	
	@Column(name="hire_date")
	private Date hireDate;
	
	@Column(name="job_id")
	private String jobId;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
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

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", lastName=" + lastName + ", salary=" + salary + ", hireDate="
				+ hireDate + ", jobId=" + jobId + ", department=" + department + "]";
	}
	
	
	
	
	

}
