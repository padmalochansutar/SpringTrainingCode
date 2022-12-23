package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.Member;
import com.csmtech.model.User;
import com.csmtech.service.MemberService;
import com.csmtech.service.UserService;

@Controller
public class MyController {
	@Autowired
	private MemberService memberService;
	@Autowired
	private UserService userService;

	@GetMapping("/test")
	public String form(Model model) {
		model.addAttribute("memberList", memberService.fetchData());
		//model.addAttribute("userList", userService.allData());
		List<User>userList=userService.allData();
		System.out.println(userList);
		return "registerForm";

	}

	@PostMapping("/saveData")
	public String saveData(@ModelAttribute User user) throws Exception {
		System.out.println("User data is:"+user);
		Long num = user.getMobileno();
	   Member dataUser=  user.getMember().get(0);
	  System.out.println( "the name of member is:"+dataUser.getName());
		System.out.println("the member data is:" + user.getMember());
		if (num != null && !"".equals(num)) {
			if (user.getAge() >= 8 && user.getAge() <= 30) {
			} else {
				throw new Exception("age should between 8 to 30");
			}
			User user1 = userService.findNum(num);
			System.out.println(user1);
			if (user1 != null) {
				throw new Exception("mobile no" + num + "already exist");
			}
		}

		userService.fetchData(user);
		// model.addAttribute("userList",userService.allData());
		return "redirect:./test";
	}

	@GetMapping("/getMobileValidate")
	public String getMobileValidate(@RequestParam("mobileno") Long number, HttpServletResponse resp)
			throws IOException {
		PrintWriter pw = resp.getWriter();
		User user = userService.findByMobileNo(number);
		if (user != null) {
			pw.println("This number is already exit !please try with another number");
		}
		return null;
	}

}
