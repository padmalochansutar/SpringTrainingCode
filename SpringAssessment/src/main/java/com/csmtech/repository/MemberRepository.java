package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Membership;
@Repository
public interface MemberRepository extends JpaRepository<Membership, Long> {

}
