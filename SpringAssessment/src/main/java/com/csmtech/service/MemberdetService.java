package com.csmtech.service;

import java.util.List;

import com.csmtech.model.Member;

public interface MemberdetService {

	void saveAll(Member memberDetails);

	//List<Member> getName(Long data);

	List<Member> getAllData();

}
