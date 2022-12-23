package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.EmpDaoImpl;
import com.csmtech.entity.Emp;

public class EmpServiceImpl implements EmpService {

	@Override
	public List<Emp> getAllEmps() {
		
		return new EmpDaoImpl().getAllEmps();
	}

	public Emp getEmpById(Long empId) {
		return new EmpDaoImpl().getEmpById(empId);
	}

}
