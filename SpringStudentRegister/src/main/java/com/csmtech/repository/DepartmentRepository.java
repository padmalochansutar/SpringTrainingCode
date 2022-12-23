package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csmtech.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
