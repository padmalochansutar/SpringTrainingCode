package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.Emp;

public interface EmpDao {
	List<Emp> getAllEmps();
	Emp getEmpById(Long empId);
}
