package com.csmtech.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.entity.Branch;
import com.csmtech.entity.Scholarship;
import com.csmtech.entity.Student;
import com.csmtech.service.BranchServiceImpl;
import com.csmtech.service.ScholarshipServiceImpl;
import com.csmtech.service.StudentServiceImpl;

public class StudentController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student=new Student();
		student.setName(req.getParameter("name").trim());
		student.setEmail(req.getParameter("email").trim());
		try {
			student.setDoa(new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("doa").trim()) );
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		student.setBranch(new BranchServiceImpl().getBranchById(Long.parseLong(req.getParameter("branchId"))));	
		
		student.setScholarship(new ScholarshipServiceImpl().getScholarshipById(Long.parseLong(req.getParameter("scholarshipId"))));
		
		new StudentServiceImpl().saveStudent(student);
		resp.sendRedirect("./getStudentInfo");
	}
	
}