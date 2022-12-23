package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.Branch;
import com.csmtech.entity.Student;

public interface BranchService {
	  List<Branch> getAllBranches();
	  Branch getBranchById(Long branchId);
}
