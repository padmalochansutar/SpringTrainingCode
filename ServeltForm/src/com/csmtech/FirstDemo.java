package com.csmtech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstDemo extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("welcome to register servlet");
		String name=req.getParameter("user_name");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String course=req.getParameter("course");
		
		String con=req.getParameter("condition");
		
		
		if(con!=null) {
		
		if(con.equals("checked")) {
			pw.println("<h2> Name:"+name+"</h2>");
			pw.println("<h2> Password:"+password+"</h2>");
			pw.println("<h2> Email:"+email+"</h2>");
			pw.println("<h2>Gender:"+gender+"</h2>");
			pw.println("<h2>Course:"+course+"</h2>");
			pw.println("<h2> Condition:"+con+"</h2>");
			
			
			//saved to db
			RequestDispatcher rd=req.getRequestDispatcher("sucess");
			rd.forward(req, resp);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conne=DriverManager.getConnection("jdbc:mysql://localhost:3306/test3","root","root");
				Statement st=conne.createStatement();
				String query="insert into student(sname,spwd,semail,sgender,scourse,scondition) values('"+name+"','"+password+"','"+email+"','"+gender+"','"+course+"','"+con+"')"; 
				int rs=st.executeUpdate(query);
				if(rs==1) {
					pw.println("1 records updated");
				}
				else {
					pw.println("1 records not updated");
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
			
			
		}
		else {
		pw.println("checked the condition button");
		}
		}
		else {
		pw.println("checked the condition button");
		//i want to include output of index.html
		
		//get the object of RequestDispatcher
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, resp);
		}
		
	}

}
