package com.csmtech.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.csmtech.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
	@Transactional
	@Modifying
	@Query("UPDATE Registration set isDelete='yes' where registrationId=:rId")
	Integer deleteDataById(@Param("rId") Integer rId);
	@Query("from Registration where isDelete='no'")
	List<Registration> findDataAll();

}
