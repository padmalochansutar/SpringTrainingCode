package com.csmtech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServelet extends HttpServlet {
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	   	resp.setContentType("text/html");
    	   	PrintWriter pw=resp.getWriter();
    	   	pw.println("third servlet");
    	   	
    	    pw.println("in third and value of book name is:"+req.getAttribute("bookName"));
    	   	System.out.println("third Servlet");
       
       
       
       
       }
}
