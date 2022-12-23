package com.csmtech.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.csmtech.model.MyUser;
@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
	@Query("from MyUser where isActive=true")
	List<MyUser> findAllActiveUsers();
	
	
	@Transactional
	@Modifying
	@Query("UPDATE MyUser set isActive=false where userId=:userId")
	Integer deleteUser(@Param("userId") Integer userId);

	
	

}
