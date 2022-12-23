package com.csmtech.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csmtech.model.Departments;
import com.csmtech.model.Employees;
import com.csmtech.model.User;
import com.csmtech.repository.DepartmentsRepository;
import com.csmtech.repository.EmployeesRepository;



@RestController
@RequestMapping("/emp")
public class MyRestController {
	
	private Map<String, User> userMap=null;
	
	
	public  MyRestController() {
		userMap=new LinkedHashMap<>();
	}
	
	@PostMapping(value="/saveUser",
			//produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	
	public String saveUser(@Valid @RequestBody User user) {
		userMap.put(user.getUserId(),user);
		return "added";
	}
	@PutMapping(value="/",
			produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public String updateUser(@RequestParam("uId")@Valid String uId  , User user) {
		
		
		User sUser=userMap.get(uId);
		sUser.setUserId(user.getUserId());
		sUser.setPassword(user.getPassword());
		sUser.setAge(user.getAge());
		sUser.seteMail(user.geteMail());
		sUser.setPhoneNo(user.getPhoneNo());
		
		userMap.remove(uId);
		userMap.replace(user.getUserId(), sUser);
		return "updated";
		
	}
	
	
	@GetMapping(value="/getAllUser",
			produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Map<String, User> getAllusers() {
		return userMap;
		
	}
	@GetMapping("/getException")
	public String getException() {
		Integer a = 2;
		Integer b = 0;
		System.out.println(0/2);
		return "Working...";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired
//	private EmployeesRepository employeesRepository;
//	@Autowired
//	private DepartmentsRepository departmentsRepository;
//	
//	private List<Employees> empList;
//	
//	
//	//@GetMapping(value="/get",produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
////	public Employees getAEmp() {
//		
////		Employees e=new Employees(101,"amiti",20000.00);
////		System.out.println(e);
//		//return e;	
//	//}
////	@GetMapping(value="/getAllEmps")
////	public List<Employees >getAllEmps() {
////		empList=new ArrayList<Employees>();
////		empList.add(new Employees(201,"sunita",2300.00));
////		empList.add(new Employees(202,"arunita",2500.00));
////		return empList;
////		
////	}
////	
////	@GetMapping(value="/getIdEmps",produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
////	public Employees getEmpById(@RequestParam("eId") Integer eId) {
////		Employees emp=null;
////		for(Employees e:empList) {
//	     
////			if(e.getEmployeeId().intValue()==eId.intValue()) {
//	          
////			  emp=e;
////			}
////		}
////		
////		return emp;
////	}
////	@GetMapping(value="/getData" ,produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
////	public Departments getAllData(@RequestParam("dId") Integer dId){
////		return  departmentsRepository.getDepartmentsByDepartmentId(dId);
////		
////		
////	}
//	//get and post for use requestMapping
//	//path variable
//	@GetMapping(value="/getDepts/{id}" )
//	public Departments getAllDepartments(@PathVariable("id") Integer id){
//		return  departmentsRepository.findById(id).get();
//		
//		
//	}
//	@GetMapping(value="/getEmps" )
//	public Page<Employees> getAllEmployees(@RequestParam("pageNo") Integer pNo,@RequestParam("pageSize") Integer pSize){
//		return   employeesRepository .findAll(PageRequest.of(pNo, pSize));
//		
//		
//	}
//	@GetMapping(value="/getEmpsSorted" )
//	public List<Employees> getAllEmployeesSortBySalary(){
//		return   employeesRepository .findAll(Sort.by(Direction.DESC,"salary"));
//		
//		
//	}
//	
//	@GetMapping(value="/getEmpsDeprtSorted/{deptId}" )
//	public List<Employees> getAllEmployeesByDeptIdSortedSalary(@PathVariable("deptId") Integer deptId){
//		return   employeesRepository .getEmployeeByDepartmentId(deptId,Sort.by(Direction.DESC,"salary"));
//		
//		
//	}
//	
	
}
