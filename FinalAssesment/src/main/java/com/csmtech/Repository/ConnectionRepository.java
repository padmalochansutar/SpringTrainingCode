package com.csmtech.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csmtech.Model.Connection;
import com.csmtech.Model.Provider;

public interface ConnectionRepository extends JpaRepository<Connection, Integer> {

	
	@Query("from Connection where providerid=:id")
	List<Connection> getallspeed(Integer id);

	

}
