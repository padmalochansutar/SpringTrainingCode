package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.EmpDto;

public interface EmpDao {

	Integer saveEmp(EmpDto empDto);
	List<EmpDto> getAllRecords();
	

}
