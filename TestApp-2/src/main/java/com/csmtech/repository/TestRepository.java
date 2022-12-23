package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Test;
@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
     
	@Query("select mobileno from  Test where mobileno=:mobileNo")
	String getTestMobileno(@Param("mobileNo")String mobileNo);
    @Query("from Test where name=:data")
	List<Test> getName(String data);

}
