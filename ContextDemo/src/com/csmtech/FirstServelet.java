package com.csmtech;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.domain.Book;


public class FirstServelet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       resp.setContentType("text/html");
	       PrintWriter pw=resp.getWriter();
	       pw.println("First Servelet");
	       ServletContext servletContext=getServletContext();
	       Book b=new Book();
	       b.setBookId(101);
	       b.setBookName("c");
	       b.setBookPrice(230.56);
	       servletContext.setAttribute("name",b);
	       
	       try {
			Class.forName(servletContext.getInitParameter("driver_class"));
			Connection con= DriverManager.getConnection(servletContext.getInitParameter("url"),servletContext.getInitParameter("user"),servletContext.getInitParameter("password"));
			pw.println(con);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	       
	       
	       ServletConfig  servletConfig=getServletConfig();
	       //req.parameter
	       pw.println(servletConfig.getInitParameter("new_name"));
	       
	       
	       //req.attributes..
	       req.setAttribute("bookName", "compiler design");
	       
	       
	       System.out.println("first servelet");
	
	       RequestDispatcher rd=req.getRequestDispatcher("/second");
	     //  rd.forward(req, resp);
	       rd.include(req, resp);
	}
	

}
