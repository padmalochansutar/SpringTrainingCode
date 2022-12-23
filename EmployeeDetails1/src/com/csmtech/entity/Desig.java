package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="designation")
public class Desig implements Serializable {
	@Id
	@Column(name="desigid")
	private Long desigId;
	@Column(name="designame")
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
