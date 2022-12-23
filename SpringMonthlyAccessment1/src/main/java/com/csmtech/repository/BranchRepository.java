package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csmtech.model.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
	@Query("from Branch where collegeId=:cId")
	List<Branch> findByCId(Integer cId);

}
