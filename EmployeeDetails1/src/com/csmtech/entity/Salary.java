package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Salary implements Serializable {
	
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sId;
     @Column(name="empid")
     private Long empId;
     
     private String month;
     
     private Integer year;
     
     private Double salary;
     
     private Double tap;
     private Double dap;
     private Double hra;
     private Double pf;
     
     
     
     
     private Double bonus;
     private Double deduction;
     
     private Double netSalary;

	public Long getsId() {
		return sId;
	}

	public void setsId(Long sId) {
		this.sId = sId;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
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

	public Double getHra() {
		return hra;
	}

	public void setHra(Double hra) {
		this.hra = hra;
	}

	public Double getPf() {
		return pf;
	}

	public void setPf(Double pf) {
		this.pf = pf;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Double getDeduction() {
		return deduction;
	}

	public void setDeduction(Double deduction) {
		this.deduction = deduction;
	}

	public Double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "Salary [sId=" + sId + ", empId=" + empId + ", month=" + month + ", year=" + year + ", salary=" + salary
				+ ", tap=" + tap + ", dap=" + dap + ", hra=" + hra + ", pf=" + pf + ", bonus=" + bonus + ", deduction="
				+ deduction + ", netSalary=" + netSalary + "]";
	}

	
	     

}
