package com.csmtech.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.csmtech.model.UserFormData;
import com.csmtech.service.UserFormDataService;

@Controller
public class UserController {
	@Autowired
	private UserFormDataService userFormDataService; 
	
	@RequestMapping(path="/saveUser",method=RequestMethod.GET)
	public String getUserForm(Model model) {
//		UserFormData userData=new UserFormData();
//		userData.setName("Amiti");
//		userData.setAppliedDate(new Date());
//		userData.setUserPic("mypic.jpg");
//		userData.setIsDelete(false);
//		userFormDataService.saveUserFormData(userData);
		//Form data:-
		
		model.addAttribute("userList",userFormDataService.getAllData());		
		
		return "userForm";
	}
	@RequestMapping(path="/saveUser",method=RequestMethod.POST)
	public String saveUserForm(@RequestParam("nameId") String name,
			@RequestParam("dateId") String appliedDate,
			@RequestParam("imageId") MultipartFile userPic)  {
		File file=new File("E:/PicFile/" +userPic.getOriginalFilename());
		BufferedOutputStream bf=null;
		
		
		try {
			byte[] bytes = userPic.getBytes();
			bf=new BufferedOutputStream(new FileOutputStream(file));
			bf.write(bytes);
			bf.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		UserFormData userData=new UserFormData();
		userData.setName(name);
		try {
			userData.setAppliedDate(new SimpleDateFormat("yyyy-MM-dd").parse(appliedDate));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	userData.setUserPic("E:/PicFile/" +userPic.getOriginalFilename());
   	userData.setIsDelete(false);
   	userFormDataService.saveUserFormData(userData);

		return "redirect:./saveUser";
		
	}

}
