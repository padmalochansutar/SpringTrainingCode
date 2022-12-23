package com.csmtech.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class States  implements Serializable{
	@Id
	@Column(name="state_id")
	private Integer stateId;
	
	private String name;

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "States [stateId=" + stateId + ", name=" + name + "]";
	}

	

}
