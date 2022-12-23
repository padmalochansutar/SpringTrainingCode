package com.csmtech.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private Long rollNo;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="doa")
	private Date doa;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="branch_id")
	private Branch branch;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="scholarship_id")
	private Scholarship scholarship;
	
	@ManyToMany
	@JoinTable(name="student_course", joinColumns =@JoinColumn(name="student_id"),inverseJoinColumns=@JoinColumn(name="course_id"))
	
	private List<Course> course;

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDoa() {
		return doa;
	}

	public void setDoa(Date doa) {
		this.doa = doa;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Scholarship getScholarship() {
		return scholarship;
	}

	public void setScholarship(Scholarship scholarship) {
		this.scholarship = scholarship;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", email=" + email + ", doa=" + doa
				+ ", branch=" + branch + ", scholarship=" + scholarship + ", course=" + course + "]";
	}

	
	
	

}
