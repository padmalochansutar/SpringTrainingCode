package com.csmtech.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.csmtech.entity.Emp;
import com.csmtech.service.EmpServiceImpl;
import com.csmtech.util.DbUtil;

public class DeleteEmp extends HttpServlet {
	
	
	Session session=null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
	session=DbUtil.getSessionFactory().openSession();
   new EmpServiceImpl().deleteEmpById(Long.parseLong(req.getParameter("empId")));
	resp.sendRedirect("./getEmpForm");
	
	}

}
