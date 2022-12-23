package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Validate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String hno=req.getParameter("houseno");
		//String name=req.getParameter("name");
		//String lane=req.getParameter("lane");
		PrintWriter pw=resp.getWriter();
		Cookie[] cookies=req.getCookies();
		
		HttpSession session=req.getSession();
		
	//	pw.println("<h2>Hello "+cookies[0].getValue()+" of"+hno+"</h2>");
		
		pw.println("<h2>Hello "+session.getAttribute("name")+" of"+hno+"</h2>");

		
		
	}
}

