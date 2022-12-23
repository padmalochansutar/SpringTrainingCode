package com.csmtech;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FourthServelet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			 
		//resp.sendRedirect("https://www.google.com/search?q="+req.getParameter("name"));
		resp.sendRedirect("./loginForm.html");
	}
}
