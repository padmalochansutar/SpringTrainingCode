package com.csmtech.entity;



import java.io.Serializable;
import java.util.Date;

public class EmpDto implements Serializable {
	private Long empId;
	private String empName;
	private Double salary;
	private Date hireDate;
	private Long deptId;
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
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "EmpDto [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", hireDate=" + hireDate
				+ ", deptId=" + deptId + "]";
	}
	
	
}
