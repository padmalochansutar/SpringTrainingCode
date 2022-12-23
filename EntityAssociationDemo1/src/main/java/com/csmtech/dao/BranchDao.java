package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.Branch;

public interface BranchDao {

	List<Branch> getAllBranch();
	Branch getBranchById (Long bId);

}
