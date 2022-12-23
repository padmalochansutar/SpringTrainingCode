package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.States;
@Repository
public interface StatesRepository extends JpaRepository<States, Integer> {

}
