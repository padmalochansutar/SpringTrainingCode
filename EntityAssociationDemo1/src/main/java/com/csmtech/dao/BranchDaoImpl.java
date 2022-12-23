package com.csmtech.dao;

import java.util.List;


import org.hibernate.Session;

import com.csmtech.dbutil.DbUtil;
import com.csmtech.entity.Branch;

public class BranchDaoImpl implements BranchDao {
	private Session session = null;
	private List<Branch> branchList;
	@Override
	public List<Branch> getAllBranch() {
		session = DbUtil.getSessionFactory().openSession();
		branchList = session.createQuery("From Branch").list();
		session.close();
		return branchList;
		
	}
	@Override
	public Branch getBranchById(Long bId) {
		session = DbUtil.getSessionFactory().openSession();
		Branch b = session.get(Branch.class, bId);
		session.close();
		return b;
	}

}
