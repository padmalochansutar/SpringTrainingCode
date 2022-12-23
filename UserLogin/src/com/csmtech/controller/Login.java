package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.service.LoginService;
import com.csmtech.service.LoginServiceImpl;

public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		String uName=req.getParameter("user_name");
		String uPwd=req.getParameter("pwd");
		
		
		LoginService login=new LoginServiceImpl();
		String result=login.getLogin(uName,uPwd);
		pw.println(result );
		

}
}