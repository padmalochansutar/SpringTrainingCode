package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.EmpDaoImpl;
import com.csmtech.entity.Emp;

public class EmpServiceImpl implements EmpService {

	public List<Emp> getAlldata() {
		
		return new EmpDaoImpl().getAlldata();
	}

}
