package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.ScholarshipDao;
import com.csmtech.dao.ScholarshipDaoImpl;
import com.csmtech.entity.Scholarship;

public class ScholarshipServiceImpl implements ScholarshipService {

	@Override
	public List<Scholarship> getAllScholarship() {
		ScholarshipDao scholarshipDaoImpl = new ScholarshipDaoImpl();
		return scholarshipDaoImpl.getAllScholarship();
	}

	@Override
	public Scholarship getScholarshipById(Long sId) {
		return new ScholarshipDaoImpl().getScholarshipById(sId);
		
	}

}
