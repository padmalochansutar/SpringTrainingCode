package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.csmtech.entity.Branch;
import com.csmtech.entity.Scholarship;
import com.csmtech.entity.Student;
import com.csmtech.service.BranchServiceImpl;
import com.csmtech.service.ScholarshipServiceImpl;
import com.csmtech.service.StudentServiceImpl;
import com.csmtech.util.DbUtil;

public class FrontController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		Session session=DbUtil.getSessionFactory().openSession();
		
		if(req.getServletPath().equals("/getStudentInfo")) {
		
		req.setAttribute("studentList", new StudentServiceImpl().getAllStudents());
		req.setAttribute("branchList", new BranchServiceImpl().getAllBranches());
		req.setAttribute("scholarshipList", new ScholarshipServiceImpl().getAllScholarship());
		req.getRequestDispatcher("studentInfo.jsp").forward(req, resp);
		
		}
		
	}
}
