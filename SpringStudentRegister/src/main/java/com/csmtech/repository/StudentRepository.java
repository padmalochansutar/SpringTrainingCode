package com.csmtech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csmtech.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByAddhar(Long addhar);

}
