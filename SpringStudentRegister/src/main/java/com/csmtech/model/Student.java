package com.csmtech.model;

import java.io.File;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	private String stName;
	
	private Date stDob;
	
	private Long addhar;
	
	private Long pincode;
	
	private String pic;
	
	private Integer deptId;
	
	private Integer courseId;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public Date getStDob() {
		return stDob;
	}

	public void setStDob(Date stDob) {
		this.stDob = stDob;
	}

	public Long getAddhar() {
		return addhar;
	}

	public void setAddhar(Long addhar) {
		this.addhar = addhar;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", stName=" + stName + ", stDob=" + stDob + ", addhar=" + addhar
				+ ", pincode=" + pincode + ", pic=" + pic + ", deptId=" + deptId + ", courseId=" + courseId + "]";
	}

	
	
}
