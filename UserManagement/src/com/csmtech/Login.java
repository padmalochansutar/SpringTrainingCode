package com.csmtech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.service.LoginService;
import com.csmtech.service.LoginServiceImpl;

public class Login extends HttpServlet {
	LoginService loginservice=null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter pw=resp.getWriter();
			String uName=req.getParameter("user_name");
			String uPassword=req.getParameter("pwd");
			System.out.println(uName+" "+uPassword);
			loginservice=new LoginServiceImpl();//pass to servicemethod
			pw.println(loginservice.validateLogin(uName, uPassword));
			
	
	
	
	
	}

}
