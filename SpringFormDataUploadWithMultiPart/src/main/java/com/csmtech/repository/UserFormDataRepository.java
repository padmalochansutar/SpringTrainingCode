package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.UserFormData;
@Repository
public interface UserFormDataRepository extends JpaRepository<UserFormData, Integer> {

}
