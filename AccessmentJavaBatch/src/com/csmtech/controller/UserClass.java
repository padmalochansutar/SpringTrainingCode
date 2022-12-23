package com.csmtech.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.entity.User;
import com.csmtech.service.UserService;
import com.csmtech.service.UserServiceImpl;



public class UserClass extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid=req.getParameter("userId");
		String name=req.getParameter("userName");
		String address=req.getParameter("Address");
		Long phone=Long.parseLong(req.getParameter("number"));
		String email=req.getParameter("email");
		String password=req.getParameter("pwd");
		
		
		
		User user=new User();
		user.setUserId(userid);
		
		user.setName(name);
		user.setAddress(address);
		user.setPhone(phone);
		user.setEmail(email);
		user.setType("user");
		user.setPassword(password);
		
		
		UserService userService=new UserServiceImpl();
		userService.saveData(user);
		
		//resp.sendRedirect("userLogin.jsp");
		
     req.getRequestDispatcher("/userLogin.jsp").forward(req, resp);
		
	}

}
