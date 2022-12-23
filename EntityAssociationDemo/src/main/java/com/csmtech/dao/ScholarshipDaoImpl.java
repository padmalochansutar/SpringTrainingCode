package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;

import com.csmtech.entity.Scholarship;
import com.csmtech.util.DbUtil;

public class ScholarshipDaoImpl implements ScholarshipDao {
	private Session session;
	private List<Scholarship> scholarshipList;
	@Override
	public List<Scholarship> getAllScholarship() {
		session=DbUtil.getSessionFactory().openSession();
		scholarshipList=session.createQuery("From Scholarship").list();
		session.close();
		return scholarshipList;
	}
	@Override
	public Scholarship getScholarshipById(Long sId) {
		session=DbUtil.getSessionFactory().openSession();
		Scholarship s=session.get(Scholarship.class, sId);
		session.close();
		
		return s;
	}

}
