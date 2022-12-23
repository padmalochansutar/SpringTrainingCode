package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.entity.Emp;
import com.csmtech.entity.Salary;
import com.csmtech.service.EmpServiceImpl;
import com.csmtech.service.SalaryService;
import com.csmtech.service.SalaryServiceImpl;

public class ProcessSalary extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		Long empId=Long.parseLong(req.getParameter("empId"));
		String month=req.getParameter("month").trim();
		Integer year=Integer.parseInt(req.getParameter("year"));
		Double bonus=Double.parseDouble(req.getParameter("bonus"));
		Salary sal=new Salary();
		sal.setEmpId(empId);
		sal.setMonth(month);
		sal.setYear(year);
		sal.setBonus(bonus);
		pw.println(sal);
		
		
		SalaryService salaryService=new SalaryServiceImpl();
		salaryService.saveSalary(sal);
		
		
		
	}

}
