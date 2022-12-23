package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Cities;
import com.csmtech.model.States;
@Repository
public interface CitiesRepository extends JpaRepository<Cities, Integer> {
	@Query("from Cities where stateId=:stateId")
	List<Cities> findCitiesByStateId(Integer stateId);

}
