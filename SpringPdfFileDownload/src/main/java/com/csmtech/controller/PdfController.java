package com.csmtech.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csmtech.helper.UserPDFExporter;
import com.csmtech.model.Role;
import com.csmtech.model.User;
import com.csmtech.repository.RoleRepository;
import com.csmtech.repository.UserRepository;
import com.lowagie.text.DocumentException;

@Controller
public class PdfController {
	@Autowired
	private RoleRepository roleRepo;
	@Autowired
	private UserRepository userRepo;
	@RequestMapping
	public String test() {
		return "pdf";
	}
	@GetMapping("/data")
	public void createdata() {
		
		userRepo.save(createUserObject1());
		userRepo.save(createUserObject2());
	}
	   private static User createUserObject1() {
	        User user = new User();
	        user.setFullName("user1");
	        user.setPassword("testPassword");
	        user.setEmail("testPaswword@gmail.com");
	        user.setEnabled(true);
	        Role role = new Role();
	        role.setName("Lab Staff");
	        List<Role> roles = Collections.singletonList(role);
	        user.setRoles(roles);
	        return user;
	    }
	   private static User createUserObject2() {
	        User user = new User();
	        user.setFullName("user2");
	        user.setPassword("testPassword2");
	        user.setEmail("testPaswword2@gmail.com");
	        user.setEnabled(true);
	        Role role1 = new Role();
	        role1.setName("Teacher");
	        Role role2 = new Role();
	        role2.setName("Chairman");
	        List<Role> roles = new ArrayList<>();
	        roles.add(role1);
	        roles.add(role2);
	        user.setRoles(roles);
	        return user;
	    }
	   
	   @GetMapping("/users/export/pdf")
	    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
	        response.setContentType("application/pdf");
	        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	        String currentDateTime = dateFormatter.format(new Date());
	         
	        String headerKey = "Content-Disposition";
	        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
	        response.setHeader(headerKey, headerValue);
	         
	        List<User> listUsers = userRepo.findAll();
	        System.out.println("the list of user is:"+listUsers);
	        UserPDFExporter exporter = new UserPDFExporter(listUsers);
	        
	        exporter.export(response);
	         
	    }

}
