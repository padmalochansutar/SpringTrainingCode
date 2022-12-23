package com.csmtech.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Number extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.setContentType("text/html");
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		Integer nn1=Integer.parseInt(n1);
		Integer nn2=Integer.parseInt(n2);
		 
		Integer nn3=nn1+nn2;
		//attribute...
		req.setAttribute("sum", nn3);
		
		//request Dispatcher
		RequestDispatcher rd=req.getRequestDispatcher("number1");rd.forward(req, resp);
		
		
	}

}
