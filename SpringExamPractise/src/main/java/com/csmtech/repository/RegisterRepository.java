package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Register;
@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer> {

	public List<Register> findByFname(String fName);

	

}
