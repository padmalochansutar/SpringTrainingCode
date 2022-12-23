package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {
    
     @Query("from Branch where collegeId=:cId")
	List<Branch> findBranchBycollegeId(Integer cId);

}
