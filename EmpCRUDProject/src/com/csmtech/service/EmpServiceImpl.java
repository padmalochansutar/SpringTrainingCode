package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.EmpDao;
import com.csmtech.dao.EmpDaoImpl;
import com.csmtech.entity.Emp;

public class EmpServiceImpl implements EmpService {

	@Override
	public Long saveEmp(Emp emp) {
		EmpDao empDao=new EmpDaoImpl();
		return  empDao.saveEmp(emp);
	}
   public List<Emp> getAllEmps(){
	   return new EmpDaoImpl().getAllEmps();
   }

public void deleteEmpById(long empId) {
     new EmpDaoImpl().deleteEmpById(empId);	
}
public void updateById(long empId) {
	new EmpDaoImpl().updateById(empId);
	
}

	

}
