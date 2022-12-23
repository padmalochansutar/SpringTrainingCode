package com.csmtech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServelet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       resp.setContentType("text/html");
	       PrintWriter pw=resp.getWriter();
	       pw.println("Second Servelet");
	       ServletContext servletContext=getServletContext();
	       pw.println(servletContext.getAttribute("name"));
	       pw.println( servletContext.getInitParameter("driver_class"));
	       pw.println( servletContext.getInitParameter("url"));
	       pw.println( servletContext.getInitParameter("user"));
	       pw.println( servletContext.getInitParameter("password"));
	       ServletConfig  servletConfig=getServletConfig();
	       pw.println(servletConfig.getInitParameter("new_name"));
	       
	       pw.println("in second and value of book name is:"+req.getAttribute("bookName"));
	       System.out.println("Second sevelet");
	       
	       RequestDispatcher rd=req.getRequestDispatcher("/third");
	      // rd.forward(req, resp);
	       rd.include(req, resp);
	}
}
