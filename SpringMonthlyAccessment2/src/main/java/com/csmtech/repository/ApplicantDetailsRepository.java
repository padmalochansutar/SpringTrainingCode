package com.csmtech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csmtech.model.ApplicantDetails;
import com.csmtech.model.ConnectionSpeed;

public interface ApplicantDetailsRepository extends JpaRepository<ApplicantDetails, Integer> {
    @Query("from ApplicantDetails a where a.serviceProvider.providerId=:pId ")
	List< ApplicantDetails> findAll(Integer pId);
     

}
