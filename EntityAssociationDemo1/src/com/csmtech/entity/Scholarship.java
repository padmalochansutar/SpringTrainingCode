package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="scholarship")
public class Scholarship implements Serializable {
	@Id
	@Column(name="scholarship_id")
	private Long scholarshipId;
    @Column(name="scholarship_name")
	private String scholarshipName;
    
    @OneToOne(mappedBy="scholarship")
    private Student student;

	public Long getScholarshipId() {
		return scholarshipId;
	}

	public void setScholarshipId(Long scholarshipId) {
		this.scholarshipId = scholarshipId;
	}

	public String getScholarshipName() {
		return scholarshipName;
	}

	public void setScholarshipName(String scholarshipName) {
		this.scholarshipName = scholarshipName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Scholarship [scholarshipId=" + scholarshipId + ", scholarshipName=" + scholarshipName + "]";
	}
	

}
