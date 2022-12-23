package com.csmtech.service;

import java.util.ArrayList;
import java.util.List;

import com.csmtech.dao.DeptDao;
import com.csmtech.dao.DeptDaoImpl;
import com.csmtech.entity.DeptDto;
import com.csmtech.entity.DeptVo;

public class DeptServiceImpl implements DeptService {

	@Override
	public List<DeptVo> getAllDepts() {
		DeptDao deptDao=new DeptDaoImpl();
		List<DeptDto> deptDtoList=deptDao.getAllDepts();
		List<DeptVo> deptVoList=null;
		if(deptDtoList!=null) {
			deptVoList=new ArrayList<DeptVo>();
		
		for(DeptDto deptDto:deptDtoList) {
			DeptVo deptVo=new DeptVo();
		    deptVo.setDeptId(deptDto.getDeptId().toString());
		    deptVo.setDeptName(deptDto.getDeptName().toString());
		    deptVoList.add(deptVo);
	}

	}
		
		return deptVoList;
}
}
