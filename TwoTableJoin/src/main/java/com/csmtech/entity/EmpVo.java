package com.csmtech.entity;


public class EmpVo {
	
	private String empId;
	private String empName;
	private String salary;
	private String hireDate;
	private String deptId;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "EmpVo [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", hireDate=" + hireDate
				+ ", deptId=" + deptId + "]";
	}
	
	

}
