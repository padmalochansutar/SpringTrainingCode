package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.SignUp;
@Repository
public interface SignUpRepository extends JpaRepository<SignUp, Integer> {
    
	
	public SignUp findByMobileNo(Long mobile);

	public SignUp findByEmailId(String tempEmail);

	public SignUp findByEmailIdAndPassword(String mail, String passw);

}
