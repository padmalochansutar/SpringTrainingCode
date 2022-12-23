package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.BranchDaoImpl;
import com.csmtech.entity.Branch;

public class BranchServiceImpl implements BranchService {

	@Override
	public List<Branch> getAllBranches() {
		
		return new BranchDaoImpl().getAllBranches();
	}

	@Override
	public Branch getBranchById(Long brachId) {
		return new BranchDaoImpl().getBranchById(brachId);
	}

}
