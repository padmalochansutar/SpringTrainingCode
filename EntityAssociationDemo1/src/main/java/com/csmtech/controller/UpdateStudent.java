package com.csmtech.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.csmtech.dbutil.DbUtil;
import com.csmtech.entity.Student;



public class UpdateStudent extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Session session = DbUtil.getSessionFactory().openSession();
		req.setAttribute("stdroll",session.get(Student.class,Long.parseLong(req.getParameter("rollNo"))));
		req.getRequestDispatcher("./getStudentInfo").forward(req, resp);
		
	}

}
