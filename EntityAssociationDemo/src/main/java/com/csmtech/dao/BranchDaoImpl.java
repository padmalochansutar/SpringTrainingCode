package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;

import com.csmtech.entity.Branch;
import com.csmtech.util.DbUtil;

public class BranchDaoImpl implements BranchDao {
	private Session session=null;
	private List<Branch> branchList;
	@Override
	public List<Branch> getAllBranches() {
		session=DbUtil.getSessionFactory().openSession();
		branchList=session.createQuery("From Branch").list();
		session.close();
		return branchList;
		
	}
	@Override
	public Branch getBranchById(Long brachId) {
		session=DbUtil.getSessionFactory().openSession();
		Branch b=session.get(Branch.class, brachId);
		session.close();
		return b;
	}

}
