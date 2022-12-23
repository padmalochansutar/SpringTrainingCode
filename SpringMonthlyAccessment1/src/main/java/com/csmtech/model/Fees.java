package com.csmtech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Fees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer feesId;
	
	private Long fees;
	@OneToOne
	@JoinColumn(name="branchId")
	private Branch branch;
	public Integer getFeesId() {
		return feesId;
	}
	public void setFeesId(Integer feesId) {
		this.feesId = feesId;
	}
	public Long getFees() {
		return fees;
	}
	public void setFees(Long fees) {
		this.fees = fees;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Fees [feesId=" + feesId + ", fees=" + fees + ", branch=" + branch + "]";
	}
	
	
	
	

}
