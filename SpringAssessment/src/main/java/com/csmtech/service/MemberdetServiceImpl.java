package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.Member;
import com.csmtech.repository.MemberDetailsRepository;
@Service
public class MemberdetServiceImpl implements MemberdetService {
	
	@Autowired
	private MemberDetailsRepository memberDetailsRepository;

	@Override
	public void saveAll(Member memberDetails) {
		memberDetailsRepository.save(memberDetails);

	}

	
	
	/*
	 * @Override public List<Member> getName(Long data) {
	 * 
	 * return memberDetailsRepository.getName(data);
	 * 
	 * }
	 */
	 


	@Override
	public List<Member> getAllData() {
		
		return memberDetailsRepository.findAll() ;
	}
	 

}
