package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="membership")
public class Membership implements Serializable {
	@Id
	@Column(name="memberid")
	private Long memberId;
	
	private String type;
	
	private Long fees;

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getFees() {
		return fees;
	}

	public void setFees(Long fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Membership [memberId=" + memberId + ", type=" + type + ", fees=" + fees + "]";
	}
	

}
