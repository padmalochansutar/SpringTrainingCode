package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Emp implements Serializable {
	@Id
	@Column(name="empid")
	private Long empId;
	@Column(name="empname")
	private String empName;
	@Column(name="deptid")
	private Long deptId;
	@Column(name="desigid")
	private Long desigId;
	@Column(name="salary")
	private Double salary;
	@Column(name="tap")
	private Double tap;
	@Column(name="dap")
	private Double dap;
	@Column(name="hrap")
	private Double hrap;
	@Column(name="pfp")
	private Double pfp;
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
	public Double getTap() {
		return tap;
	}
	public void setTap(Double tap) {
		this.tap = tap;
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
	public Double getPfp() {
		return pfp;
	}
	public void setPfp(Double pfp) {
		this.pfp = pfp;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", desigId=" + desigId
				+ ", salary=" + salary + ", tap=" + tap + ", dap=" + dap + ", hrap=" + hrap + ", pfp=" + pfp + "]";
	}
	
	
	
	
	

}
