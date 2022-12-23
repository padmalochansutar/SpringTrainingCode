package com.csmtech.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table (name = "branch")
public class Branch implements Serializable {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "branch_id")
	private Long branchId;
	
	@Column (name = "branch_name")
	private String branchName;
	
	@OneToMany	
	@JoinColumn(name="branch_id")
	private List<Student> student;

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + "]";
	}
	
	
	
	

}
