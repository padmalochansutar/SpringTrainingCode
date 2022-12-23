package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.Scholarship;

public interface ScholarshipService {
	List<Scholarship> getAllScholarship();
	Scholarship getScholarshipById(Long sId);

}
