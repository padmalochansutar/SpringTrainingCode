package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.Branch;

public interface BranchService {
	List<Branch> getAllBranch();
	Branch getBranchById (Long bId);
}
