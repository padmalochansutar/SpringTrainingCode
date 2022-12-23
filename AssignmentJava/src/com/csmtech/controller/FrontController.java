package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
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
		PrintWriter pw=resp.getWriter();
		//check the data it is coming or not
		//1.pw.println(DbUtil.getSessionFactory().openSession().createQuery("From Desig").list());
		if(req.getServletPath().equals("/getSalForm"));
			//for month:-
			//req.setAttribute("months",new ArrayList<String>(Arrays.asList("jan","feb","mar","apr","may","june","july","aug","sept","oct","nov","dec")));
			//resp.sendRedirect("salaryProcessingForm.jsp");//go to jsp form
		//for year:-
		Integer currentYear=Calendar.getInstance().get(Calendar.YEAR);
		ArrayList<Integer> last5Year=new ArrayList<Integer>();
		for(int i=1; i<=5;i++)
			last5Year.add(currentYear--);
		
		EmpService empService=new EmpServiceImpl();
		List<Emp> empList=empService.getAllEmps();
		
		req.setAttribute("empList", empList);
		req.setAttribute("years", last5Year);
		req.setAttribute("months",new ArrayList<String>(Arrays.asList("jan","feb","mar","apr","may","june","july","aug","sept","oct","nov","dec")));
		req.getRequestDispatcher("salaryProcessingForm.jsp").forward(req, resp);
			
	}

}
