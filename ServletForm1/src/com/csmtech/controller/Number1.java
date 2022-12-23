package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Number1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		Integer num=Integer.parseInt(req.getParameter("n1"));
		Integer num1=Integer.parseInt(req.getParameter("n2"));
		Integer product=num*num1;
		
		
		
		
		
		Integer sum=(Integer)req.getAttribute("sum");
		pw.println("sum:"+sum);
		pw.println("product is:"+product);
		
		
	}

}
