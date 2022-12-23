package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.Scholarship;
import com.csmtech.entity.Student;

public interface ScholarshipService {
   List<Scholarship> getAllScholarship();
   Scholarship getScholarshipById(Long scholarshipId);
}
