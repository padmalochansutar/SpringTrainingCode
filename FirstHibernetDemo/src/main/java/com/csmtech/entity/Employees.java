package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employees")
public class Employees implements Serializable {
	@Id
	@Column(name="employee_id")
	private Long employeeId;
	
	
	private String empFirstName;
	@Column(name="last_name")
	private String empLastName;
	private String empEmail;
	private String emppno;
	private String empDate;
	private Long  empjobid;
	@Column (name="salary")
	private Double salary;
	private Double commision_pct;
	private Long managerid;
	@Column(name="department_id")
	private Long departmentid;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmppno() {
		return emppno;
	}
	public void setEmppno(String emppno) {
		this.emppno = emppno;
	}
	public String getEmpDate() {
		return empDate;
	}
	public void setEmpDate(String empDate) {
		this.empDate = empDate;
	}
	public Long getEmpjobid() {
		return empjobid;
	}
	public void setEmpjobid(Long empjobid) {
		this.empjobid = empjobid;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getCommision_pct() {
		return commision_pct;
	}
	public void setCommision_pct(Double commision_pct) {
		this.commision_pct = commision_pct;
	}
	public Long getManagerid() {
		return managerid;
	}
	public void setManagerid(Long managerid) {
		this.managerid = managerid;
	}
	public Long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmail=" + empEmail + ", emppno=" + emppno + ", empDate=" + empDate + ", empjobid=" + empjobid
				+ ", salary=" + salary + ", commision_pct=" + commision_pct + ", managerid=" + managerid
				+ ", departmentid=" + departmentid + "]";
	}
	

}
