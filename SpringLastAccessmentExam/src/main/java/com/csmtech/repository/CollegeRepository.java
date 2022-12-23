package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.College;


@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
