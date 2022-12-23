package com.csmtech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.States;
@Repository
public interface StatesRepository extends JpaRepository<States, Integer> {
     @Query("from States where countryId=:countryId")   
	List<States> findStatesByCountryId(Integer countryId);

}
