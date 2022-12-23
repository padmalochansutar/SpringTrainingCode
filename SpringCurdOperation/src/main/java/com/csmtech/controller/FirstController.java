package com.csmtech.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.User;
import com.csmtech.service.UserService;

@Controller
public class FirstController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/save",method=RequestMethod.GET)
	public String getUser(Model model) {
		List<User> userList= userService.getData();
		System.out.println(userList);
		return "page";
	}
		
	
	
	
	@RequestMapping(path="/save",method=RequestMethod.POST)
	public String SaveUser(@RequestParam("name") String userName,
			@RequestParam("qfl") String qualifiaction,
			@RequestParam("date") String dob) {
		User user=new User();
		user.setUserName(userName);
		user.setQualification(qualifiaction);
		try {
			user.setDob(new SimpleDateFormat("yyyy-MM-dd").parse(dob));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		 userService.saveUserForm(user);
		
		return "redirect:./save";
	}

}
