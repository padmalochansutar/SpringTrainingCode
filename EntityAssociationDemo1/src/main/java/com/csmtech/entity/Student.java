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
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

/**
 * @author santosh.manasingh
 *
 */
@Entity
@Table (name = "student")
public class Student implements Serializable {
	
	@Id
	@Column (name = "roll_no")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long rollNo;
	
	@Column (name = "student_name")
	private String name;
	
	
	private String email;
	
	
	private Date doa;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name="branch_id")
	private Branch branch;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name="scholarship_id")
	private Scholarship scholarship;
	
	@ManyToMany
	@JoinTable(name="student_course",joinColumns = @JoinColumn(name="roll_no"),
	inverseJoinColumns = @JoinColumn(name="course_id"))
	private List<Course> courses;

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", doa=" + doa + ", branch="
				+ branch + ", scholarship=" + scholarship + ", courses=" + courses + "]";
	}

	
	
	
	

	
	
	
}
