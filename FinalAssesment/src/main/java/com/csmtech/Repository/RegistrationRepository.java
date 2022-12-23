package com.csmtech.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csmtech.Model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

	@Query("from Registration where providerid=:providerid")
	List<Registration> getalldetail(Integer providerid);

	

}
