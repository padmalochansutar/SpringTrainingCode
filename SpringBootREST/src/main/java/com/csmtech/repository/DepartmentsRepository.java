package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Departments;
@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, Integer> {
      
	 public Departments getDepartmentsByDepartmentId(Integer dId);
	
}
