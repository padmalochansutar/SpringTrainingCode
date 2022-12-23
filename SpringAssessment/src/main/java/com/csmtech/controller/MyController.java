package com.csmtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.Member;
import com.csmtech.model.Membership;
import com.csmtech.service.MemberService;
import com.csmtech.service.MemberdetService;
;

@Controller
public class MyController {
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MemberdetService memberdetService;
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("memberList",memberService.findData());
	     
		return "userregistation";
	}
	@GetMapping("/saveData")
	public String saveData(@RequestParam("userName")String name,
			@RequestParam("type") String type,
			@RequestParam("mobileno") Long mno,
			@RequestParam("fathersname") String fname,
			@RequestParam("address") String address,
			@RequestParam("gender") String gender,
			@RequestParam("age") Long age,Model model) {
		Member memberDetails=new Member();
		memberDetails.setName(name);
		memberDetails.setType(type);
		memberDetails.setMobileno(mno);
		memberDetails.setFathersname(fname);
		memberDetails.setAddress(address);
		memberDetails.setGender(gender);
		memberDetails.setAge(age);
		System.out.println(memberDetails);
		memberdetService.saveAll(memberDetails);
		Long data=mno;
		
		/*
		 * List<Member> dataList=memberdetService.getName(data);
		 * System.out.println("mobileno:"+dataList);
		 * //model.addAttribute("dataList",memberdetService.findbymobileno(data));
		 */		 
		model.addAttribute("userData",memberdetService.getAllData());
		
		return "viewPage";
		
	}
	
}
