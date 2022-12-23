package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.entity.Emp;
import com.csmtech.service.EmpService;
import com.csmtech.service.EmpServiceImpl;
import com.csmtech.util.DbUtil;

public class FrontController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getServletPath().equals("/front")) {
		
	    EmpService empService=new EmpServiceImpl();
	    List<Emp> empList=empService.getAlldata();
	    req.setAttribute("empList", empList);
	    req.getRequestDispatcher("salary.jsp").forward(req, resp);
		req.setAttribute("monthList",new ArrayList<String>(Arrays.asList("jan","feb","mar","apr","may","june","jul","august","sept","oct","nov","dec")));
		}
		
		
		
	}

}
