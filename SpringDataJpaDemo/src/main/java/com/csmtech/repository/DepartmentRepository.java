package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Department;
import com.csmtech.model.Employees;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	@Query("from Department d where d.locations.locationId=:locationId")
	List<Department> finddepartmentBylocation(Long locationId);
}
