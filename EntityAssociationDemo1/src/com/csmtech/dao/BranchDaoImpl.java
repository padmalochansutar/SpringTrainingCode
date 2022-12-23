package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;

import com.csmtech.entity.Branch;
import com.csmtech.util.DbUtil;

public class BranchDaoImpl implements BranchDao {
     private Session session=null;
     private List<Branch> branchList;
     
	public List<Branch> getAllBranches() {
		session=DbUtil.getSessionFactory().openSession();
		branchList=session.createQuery("from Branch").list();
		session.close();
		return branchList;
	}

	public Branch getBranchById(Long branchId) {
		session=DbUtil.getSessionFactory().openSession();
		Branch b=session.get(Branch.class, branchId);
		
		session.close();
		return b;
	}

	
}
