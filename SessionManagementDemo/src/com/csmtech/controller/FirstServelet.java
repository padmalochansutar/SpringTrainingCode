package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServelet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   resp.setContentType("text/html");
	   PrintWriter pw=resp.getWriter();
	   pw.println("<h3>name and mark</h3>"
			   +"<form action='./address'>"
			   +"<label>Name</label><input type='text' name='name'>"
			   +"<label> Mark</label><input type='text' name='mark'>"
			   +"<input type='submit' value='next'>"+"</form>");
	
	
	}

}
