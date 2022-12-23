package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Employees;
@Repository
public  interface EmployeesRepository extends JpaRepository<Employees, Long> {
    @Query("select e.lastName,e.department.departmentName,e.department.locations.city from Employees e where e.department.departmentId=:deptId")
    List<Object[]> findEmployeeByDepartment(long deptId);
	/*
	 * @Query(" from Employees e where e.departmentId=:deptId and e.jobId=:jobId order by e.salary desc"
	 * ) List<Employees> findEmployeesByDepartmentId(Long deptId,String jobId);
	 */
}
