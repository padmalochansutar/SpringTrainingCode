package com.csmtech.service;

import com.csmtech.dao.SalaryDaoImpl;
import com.csmtech.entity.Emp;
import com.csmtech.entity.Salary;

public class SalaryServiceImpl implements SalaryService {

	@Override
	public void saveSalary(Salary sal) {
		Emp emp=new EmpServiceImpl().getEmpById(sal.getEmpId());
        Double salary=emp.getSalary();
        Double cda =salary*emp.getDap()/100;
        Double chra=salary*emp.getHrap()/100;
        Double netSalary=salary+cda+chra+sal.getBonus();
		
		
		
		sal.setCda(cda);
		sal.setChra(chra);
		sal.setSalary(salary);
		sal.setNetSalary(netSalary);
		
		new SalaryDaoImpl().save(sal);
        		
	}

}
