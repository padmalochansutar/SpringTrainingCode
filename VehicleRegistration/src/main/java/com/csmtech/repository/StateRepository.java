package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.State;
@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
