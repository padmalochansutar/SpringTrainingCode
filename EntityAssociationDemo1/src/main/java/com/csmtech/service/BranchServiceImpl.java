package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.BranchDao;
import com.csmtech.dao.BranchDaoImpl;
import com.csmtech.entity.Branch;

public class BranchServiceImpl implements BranchService{

	@Override
	public List<Branch> getAllBranch() {
		BranchDao branchDao = new BranchDaoImpl();
		return branchDao.getAllBranch();
	}

	@Override
	public Branch getBranchById(Long bId) {
		
		return new BranchDaoImpl().getBranchById(bId);
	}

}
