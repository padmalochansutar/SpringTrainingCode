package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.User;
@Repository
public interface RegistationRepository extends JpaRepository<User, Long> {
    
	public User findByEmailId(String email);

	public User findByPassword(String tempPassword);

	public User findByEmailIdAndPassword(String email, String password);

}
