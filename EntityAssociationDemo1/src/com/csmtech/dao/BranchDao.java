package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.Branch;

public interface BranchDao {
    List<Branch> getAllBranches();
    Branch getBranchById(Long branchId);
}
