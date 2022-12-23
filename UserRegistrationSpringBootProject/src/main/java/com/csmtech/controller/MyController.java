package com.csmtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.MyUser;
import com.csmtech.service.MyRoleService;
import com.csmtech.service.MyUserService;
@RequestMapping("/user")
@Controller
public class MyController {
	@Autowired
	private MyUserService myUserService;
	
	@Autowired
	private MyRoleService myRoleService;
	
	//@RequestMapping(path={"/getUserForm","/getForm"},method=RequestMethod.GET)
	@GetMapping("/getUserForm")
	public String getUserForm(Model model) {
		System.out.println("the allroles is:"+myRoleService.getAllRoles());
		model.addAttribute("allRoles",myRoleService.getAllRoles());
		System.out.println("the all active users is:"+myUserService.getAllActiveUsers());
		model.addAttribute("allActiveUsers",myUserService.getAllActiveUsers());
		
		return "userRegistration";
	}
	@PostMapping("/saveUserForm")
	public String saveUserForm(@ModelAttribute("MyUser") MyUser myUser) {
		System.out.println("post is working.................."+myUser);
		myUserService.saveUser(myUser);
		return "redirect:./getUserForm";
	}
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("userId") Integer userId) {
		myUserService.deleteUser(userId);
		return "redirect:./getUserForm";
		
	}
	@GetMapping("/updateUser")
	public String updateUser( @RequestParam("userId") Integer userId,Model model) {
		model.addAttribute("allActiveUsers",myUserService.getAllActiveUsers());
			 
		model.addAttribute("user",myUserService.updateUser(userId));
		model.addAttribute("allRoles",myRoleService.getAllRoles());
		//return "forward:./getUserForm";
		return "userRegistration";
	} 

}
