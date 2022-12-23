package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.EmpDto;
import com.csmtech.entity.EmpVo;

public interface EmpService {
	Integer saveEmp(EmpVo empVo);
	List<EmpDto> getAllRecords();
}
