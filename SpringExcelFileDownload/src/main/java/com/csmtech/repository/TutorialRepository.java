package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csmtech.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial,Integer> {

}
