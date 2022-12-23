package com.csmtech.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Employees;
@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {
   //it is find the department by using question mark 
	//@Query("From Employees e where e.departmentId=?1")
	//List<Employees> findEmployeesByDepartmentId(Long deptId);
	//here name format
	//@Query("select e.employeeId,e.jobId, e.lastName,e.departmentId from Employees e where e.departmentId=:deptId and e.jobId=:jobId")
	//List<String> findEmployeesByDepartmentId(Long deptId,String jobId);
	
	
	//@Query("select e.employeeId, e.lastName,e.salary  from Employees e where e.departmentId=:deptId or e.jobId=:jobId")
	//List<Object[]> findEmployeesByDepartmentId(Long deptId,String jobId);
	
	
	
	//@Query("select Count(e) from Employees e")
	//List<Integer> findEmployeesByDepartmentId(Long deptId);
    // Long FindAll();
	//@Query("from Employees e where e.department.departmentId=:departmentId")
	//List<Employees> findEmployeeByDepartmentId(Long departmentId);
   
	//@Query("select e.employeeId,e.lastName,e.department.departmentName from Employees e")
	//List<Object[]> findEmployeeByDepartmentId(String departmentName);
	@Query("select e.employeeId, e.lastName,e.salary ,e.department.departmentId,e.department.locations.locationId,e.department.locations.city from Employees e")
	List<Object[]> findAllData();
	
	
	
	//List<Employees> findByLastName(String lastName);
	//List<Employees> findByJobIdOrSalary(String jobId,Double salary);
	
	//List<Employees>  findBySalaryBetween(Double salary1,Double salary2);
	List<Employees> findByhireDateBetween(Date hireDate,Date hireDate2);
	
	
}
