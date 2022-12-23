package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Emp implements Serializable {
	@Id
	@Column(name="emp_id")
	private Long empId;
	@Column(name="empname")
	private String empName;
	@Column(name="dept_id")
	private Long deptId;
	@Column(name="desig_id")
	private Long desigId;
	@Column(name="salary")
	private Double salary;
	@Column(name="dap")
	private Double dap;
	@Column(name="hrap")
	private Double hrap;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public Long getDesigId() {
		return desigId;
	}
	public void setDesigId(Long desigId) {
		this.desigId = desigId;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getDap() {
		return dap;
	}
	public void setDap(Double dap) {
		this.dap = dap;
	}
	public Double getHrap() {
		return hrap;
	}
	public void setHrap(Double hrap) {
		this.hrap = hrap;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", desigId=" + desigId
				+ ", salary=" + salary + ", dap=" + dap + ", hrap=" + hrap + "]";
	}
	
	

}
