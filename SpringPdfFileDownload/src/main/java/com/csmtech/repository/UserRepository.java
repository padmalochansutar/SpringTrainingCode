package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csmtech.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
