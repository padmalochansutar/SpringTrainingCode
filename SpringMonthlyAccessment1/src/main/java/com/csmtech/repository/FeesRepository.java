package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csmtech.model.Fees;

public interface FeesRepository extends JpaRepository<Fees, Integer> {
	@Query("select f. fees From Fees f where branchId=:bId")
    Long findByBId(Integer bId);
	

}
