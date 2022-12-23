package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
