package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.Emp;

public interface EmpService {

	List<Emp> getAllEmps();
	Emp getEmpById(Long empId);
}
