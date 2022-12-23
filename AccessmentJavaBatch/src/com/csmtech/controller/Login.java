package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.csmtech.entity.User;
import com.csmtech.service.LoginService;
import com.csmtech.service.LoginServiceImpl;




public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		if(req.getServletPath().equals("/login")) {
		 
		String userId=req.getParameter("userId");
	    String password=req.getParameter("pwd");
		
		LoginService login=new LoginServiceImpl();
		List<User> resultList=login.getLogin(userId,password);
		
			LoginService loginservice=new LoginServiceImpl();
			List<User> result=loginservice.getData();
			req.setAttribute("Admin", result);
			for(User us:result) {
				if(userId.equals(us.getUserId())){
						if(password.equals(us.getPassword())){
							if(us.getType().equals("user")) {
								req.setAttribute("User", us);
								req.getRequestDispatcher("userdata.jsp").forward(req, resp);
							}
							else{
								req.getRequestDispatcher("data.jsp").forward(req, resp);
							}
							
							
							pw.println("password is in correct");
							
						}
					pw.println("user id is incorrect");
				}
			}
		
		}
		
}
}
