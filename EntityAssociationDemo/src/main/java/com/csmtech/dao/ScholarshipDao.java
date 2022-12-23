package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.Scholarship;

public interface ScholarshipDao {
	List<Scholarship> getAllScholarship();
	Scholarship getScholarshipById(Long sId);
}
