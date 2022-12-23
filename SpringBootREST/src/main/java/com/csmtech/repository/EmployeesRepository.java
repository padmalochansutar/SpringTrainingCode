package com.csmtech.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csmtech.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

	
	@Query("from Employees where departmentId=:deptId")
	List<Employees> getEmployeeByDepartmentId(Integer deptId, Sort by);

}
