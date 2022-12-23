package com.csmtech.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAccessor;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.Department;
import com.csmtech.model.Employees;
import com.csmtech.repository.DepartmentRepository;
import com.csmtech.repository.EmployeeRepository;

@Controller
public class MyController {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	@GetMapping("/te")
	public String test1(@RequestParam("date1") String fDate,@RequestParam("date2") String lDate,Model model) {
		//Integer date=Integer.parseInt(fDate);
//		LocalDate today = LocalDate.now();
//		System.out.println("today date is :"+today);
//		LocalDate birthday = LocalDate.parse(fDate);
//		System.out.println("th form date is:"+birthday);
//		
//		Period period = Period.between( birthday,today);
//		System.out.println("The age is :"+period.getYears());
		try {
			model.addAttribute("dateList",employeeRepository.findByhireDateBetween(new SimpleDateFormat("yyyy-MM-dd").parse(fDate) ,new SimpleDateFormat("yyyy-MM-dd").parse(lDate)));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return "NewFile";
	}
	
	@GetMapping("/test")
	public String test() {
		//System.out.println(employeeRepository.findAll());
//		List<Object[]> objectList=employeeRepository.findEmployeesByDepartmentId(deptId,jobId);
//		for(Object[] obj:objectList) {
//			System.out.println(obj[0]+" "+obj[1]+" "+obj[2]);
//			
//		}
		//System.out.println(employeeRepository.FindAll());
		
		//employeeRepository.findAll().forEach(s->System.out.println(s));
		//Employees e= employeeRepository.getById(102l);
		
		//System.out.println(e.getDepartment());
		//List<Employees> emp=employeeRepository.findEmployeeByDepartmentId(90l);
		//emp.forEach(System.out::println);
		//for (Employees employees : emp) {
		//	System.out.println(employees);
		//}
		//List<Object[]> objList=employeeRepository.findEmployeeByDepartmentId("Marketing");
		//for(Object[] obj:objList) {
		//	System.out.println(obj[0]+" "+obj[1]+" "+obj[2]);
			
		//}
		
		//List<Department> dep=departmentRepository.finddepartmentBylocation(2400l);
		//dep.forEach(System.out::println);
		//for(Department de:dep) {
			//System.out.println(de);
		//}
			List<Object[]> obj=employeeRepository.findAllData();
			//objectList.forEach(System.out::println);
			for (Object[] objList : obj) {
				System.out.println(objList[0]+" "+objList[1]+" "+objList[2]+" "+objList[3]+" "+objList[4]+" "+objList[5]);
			}
		//employeeRepository.findByLastName("King").forEach(s->System.out.println(s));; 	
		//List<Employees> employees=employeeRepository.findByJobIdOrSalary("IT_PROG", 4800.00);
	     //employees.forEach(System.out::println);
	    // employees.forEach(x->System.out.println(x));
	     
	   //  List<Employees> empl;
		//try {
		//	empl = employeeRepository.findByhireDateBetween(new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-03") ,new SimpleDateFormat("yyyy-MM-dd").parse("1994-08-17"));
		//	empl.forEach(x->System.out.println(x));
		//} catch (ParseException e) {
		//	e.printStackTrace();
		//}
		return "NewFile";
	    
	}

}
