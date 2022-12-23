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
     @Column(name="emp_id")
     private Long empId;
     
     private String month;
     
     private Integer year;
     
     private Double salary;
     
     private Double cda;
     
     
     private Double chra;
     
     private Double bonus;
     
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

	public Double getCda() {
		return cda;
	}

	public void setCda(Double cda) {
		this.cda = cda;
	}

	public Double getChra() {
		return chra;
	}

	public void setChra(Double chra) {
		this.chra = chra;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
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
				+ ", cda=" + cda + ", chra=" + chra + ", bonus=" + bonus + ", netSalary=" + netSalary + "]";
	}

	     

}
