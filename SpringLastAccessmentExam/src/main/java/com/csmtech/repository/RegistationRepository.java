package com.csmtech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Registation;
@Repository
public interface RegistationRepository extends JpaRepository<Registation, Integer> {
     @Query("from Registation r where r.college.collegeId=:id")
	List<Registation> findAll(Integer id);

}
