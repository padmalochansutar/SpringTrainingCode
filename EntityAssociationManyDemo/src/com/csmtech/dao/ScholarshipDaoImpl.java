package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;

import com.csmtech.entity.Branch;
import com.csmtech.entity.Scholarship;
import com.csmtech.util.DbUtil;

public class ScholarshipDaoImpl implements ScholarshipDao {
	private Session session=null;
	 List<Scholarship> scholarshipList=null;

	@Override
	public List<Scholarship> getAllScholarship() {
		session=DbUtil.getSessionFactory().openSession();
		scholarshipList=session.createQuery("from Scholarship").list();
		session.close();
		return scholarshipList;
		
	}

	public Scholarship getScholarshipById(Long scholarshipId) {
		session=DbUtil.getSessionFactory().openSession();
		Scholarship s=session.get(Scholarship.class,scholarshipId );
		session.close();
		return s;
	}
	

	
	

}
