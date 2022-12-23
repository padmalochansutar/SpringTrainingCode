package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.Membership;
import com.csmtech.repository.MemberRepository;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberRepository memberRepository ;

	@Override
	public List<Membership> findData() {
		
		return memberRepository.findAll();
	}

	

}
