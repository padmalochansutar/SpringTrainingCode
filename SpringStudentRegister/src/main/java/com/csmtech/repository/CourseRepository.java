package com.csmtech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csmtech.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
  @Query("from Course where deptId=:deptId")
 List<Course> findCourseBydeptId(Integer deptId);

}
