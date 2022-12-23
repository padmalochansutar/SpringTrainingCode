package com.csmtech.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.csmtech.model.User;
import com.csmtech.service.UserService;

@Controller
public class MyController {
	@Autowired
	private UserService userService;
	@GetMapping("/test")
	public String test() {
		return "file";
	}
	@PostMapping("/save")
	public String fetchData(@RequestParam("name") String name,@RequestParam("emailId") String email,@RequestParam("number") Long number,
			@RequestParam("password") String password,@RequestParam("pic") MultipartFile pic) {
		File f=new File("E:/upload/"+pic.getOriginalFilename());
		BufferedOutputStream bf=null;
		
		try {
			byte[] bytes=pic.getBytes();
			bf = new BufferedOutputStream(new FileOutputStream(f));
			
			bf.write(bytes);
			bf.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		String pic1="E:/upload/"+pic.getOriginalFilename();
		User user=new User();
		user.setName(name);
		user.setEmailId(email);
		user.setNumber(number);
		user.setPassword(password);
		user.setPic(pic1);
		userService.fetchData(user);
		
		return "download";
		
		
	}
	
	public void downloadFile()

}
