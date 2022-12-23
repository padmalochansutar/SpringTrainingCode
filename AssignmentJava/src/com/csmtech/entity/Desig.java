package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Desig implements Serializable {
	@Id
	@Column(name="desig_id")
	private Long desigId;
	@Column(name="desig_name")
	private String desigName;
	public Long getDesigId() {
		return desigId;
	}
	public void setDesigId(Long desigId) {
		this.desigId = desigId;
	}
	public String getDesigName() {
		return desigName;
	}
	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}
	@Override
	public String toString() {
		return "Desig [desigId=" + desigId + ", desigName=" + desigName + "]";
	}
	

}
