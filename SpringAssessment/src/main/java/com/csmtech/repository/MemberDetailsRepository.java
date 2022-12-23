package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Member;
import com.csmtech.service.MemberdetService;


@Repository
public interface MemberDetailsRepository extends JpaRepository<Member, Long> {
	
	
	/*
	 * @Query("select mobileno,name from Member where mobileno=:data") List<Member>
	 * getName(Long data);
	 */
	  
	 
	  
	 

}
