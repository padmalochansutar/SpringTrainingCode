package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Answer;
@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
