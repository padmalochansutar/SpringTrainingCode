package com.csmtech.service;

import java.util.List;


import com.csmtech.dao.ScholarshipDaoImpl;
import com.csmtech.entity.Scholarship;
import com.csmtech.entity.Student;


public class ScholarshipServiceImpl implements ScholarshipService {

	@Override
	public List<Scholarship> getAllScholarship() {
		// TODO Auto-generated method stub
		return new ScholarshipDaoImpl().getAllScholarship();
	}

	@Override
	public Scholarship getScholarshipById(Long scholarshipId) {
		return new ScholarshipDaoImpl().getScholarshipById(scholarshipId);
		// TODO Auto-generated method stub
		
	}

	

	

	
}
