package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csmtech.model.ConnectionSpeed;

public interface ConnectionSpeedRepository extends JpaRepository<ConnectionSpeed, Integer> {
    @Query("from ConnectionSpeed where connectionName=:id ")
	ConnectionSpeed findByconnectionName(String id);
     
	
}
