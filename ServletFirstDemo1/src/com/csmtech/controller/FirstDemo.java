package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("number");
		String pwd=req.getParameter("pwd");
		
		pw.println("result:"+name+"  "+email+" "+mobile+" "+pwd);
	}

}
