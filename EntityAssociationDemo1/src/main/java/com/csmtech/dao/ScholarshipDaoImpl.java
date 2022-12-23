package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;

import com.csmtech.dbutil.DbUtil;
import com.csmtech.entity.Scholarship;

public class ScholarshipDaoImpl implements ScholarshipDao {
	private  Session session = null;
	private List<Scholarship> scholarshipList = null;

	@Override
	public List<Scholarship> getAllScholarship() {
		session = DbUtil.getSessionFactory().openSession();
		scholarshipList = session.createQuery("From Scholarship").list();
		session.close();
		return scholarshipList;
	}

	@Override
	public Scholarship getScholarshipById(Long sId) {
		session = DbUtil.getSessionFactory().openSession();
		Scholarship scholarship = session.get(Scholarship.class, sId);
		session.close();
		return scholarship;
	}

}
