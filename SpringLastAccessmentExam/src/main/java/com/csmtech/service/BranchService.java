package com.csmtech.service;

import java.util.List;

import com.csmtech.model.Branch;


public interface BranchService {

	List<Branch> findBranchBycollegeId(Integer cId);

}
