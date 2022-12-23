package com.csmtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.Department;
import com.csmtech.model.Employees;
import com.csmtech.repository.DepartmentRepository;
import com.csmtech.repository.EmployeesRepository;

@Controller
public class MyController {
	@Autowired
	private EmployeesRepository employeesRepository;
	@Autowired
	private DepartmentRepository departmentRepository;

	@GetMapping("/test")
	public void test() {
		/*
		 * List<Employees> e=employeesRepository.findAll(); for (Employees employees :
		 * e) { System.out.println(employees);
		 * 
		 * }
		 * 
		 * employeesRepository.findEmployeesByDepartmentId(deptId,jobId).forEach(s->
		 * System.out.println(s));
		 */
		List<Employees> e=employeesRepository.findAll();
		for (Employees employees :
			  e) { //System.out.println(employees);
			  System.out.println("the employee city is:"+employees.getDepartment().getLocations().getCity());
			  }
		List<Object[]>objList=employeesRepository.findEmployeeByDepartment(50l);
		for (Object[] objects : objList) {
			System.out.println(objects[0]+"...."+objects[1]+"........."+objects[2]);
			
		}
		
		List<Department>departmentList=departmentRepository.findAll();
		for (Department department : departmentList) {
			System.out.println(department);
			
		}
		
	}

}
