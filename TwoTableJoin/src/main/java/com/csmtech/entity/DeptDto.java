package com.csmtech.entity;

import java.io.Serializable;

public class DeptDto implements Serializable {
	private Long deptId;
	private String deptName;
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "DeptDto [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
}