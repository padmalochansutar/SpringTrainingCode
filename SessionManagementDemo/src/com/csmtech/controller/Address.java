package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Address extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		String mark=req.getParameter("mark");
		PrintWriter pw=resp.getWriter();
		HttpSession session=req.getSession();
		session.setAttribute("name", name);
		
		
		pw.println("<h3> Hello " + name + "</h3>");
		pw.println("<h3>Address Form</h3>" + "<form action='./validate'>"
				+ "<label>House No</label><input type='text' name='houseno'>"
				+ "<input type='hidden' name='name' value=' " + name + " '>"
				+ "<label>Lane</label><input type='text' name='lane'>" + "<input type='submit' value='next'>>"
				+ "</form>");
	}

}
