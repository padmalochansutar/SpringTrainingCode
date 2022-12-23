package com.csmtech.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.csmtech.dao.EmpDao;
import com.csmtech.dao.EmpDaoImpl;
import com.csmtech.entity.EmpDto;
import com.csmtech.entity.EmpVo;

public class EmpServiceImpl implements EmpService {

	@Override
	public Integer saveEmp(EmpVo empVo) {
		SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy");
		EmpDto empDto=new EmpDto();
		empDto.setEmpName(empVo.getEmpName());
		empDto.setSalary(Double.parseDouble(empVo.getSalary()));
		try {
			empDto.setHireDate(fm.parse(empVo.getHireDate()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		empDto.setDeptId(Long.parseLong(empVo.getDeptId()));
		
		EmpDao empDao=new EmpDaoImpl();	
		
		return empDao.saveEmp(empDto);
		
	}

	@Override
	public List<EmpDto> getAllRecords() {
		return null;
	}
	 

}
