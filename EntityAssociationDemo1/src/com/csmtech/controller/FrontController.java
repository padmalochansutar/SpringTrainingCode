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
		PrintWriter pw=resp.getWriter();
		
		/*
		 * //pw.println("working.......");
		 * pw.println(DbUtil.getSessionFactory().openSession());
		 */
		
	    
	   // pw.println(session.createQuery("from Branch").list());
	    //pw.println(session.createQuery("from Scholarship").list());
	    //for all records
		/*
		 * List<Student> studentList=session.createQuery("from Student").list();
		 * for(Student x:studentList) pw.println(x);
		 */
		/*
		 * Student x=session.get(Student.class, 101l); pw.println(x);
		 */
	   // Scholarship x=session.get(Scholarship.class, 1l);
	   // pw.println(x+""+x.getStudent());
	    
	  // Student y= session.get(Student.class,101l);
	  // pw.println(y+" "+y.getScholarship().getScholarshipName()+" "+y.getBranch().getBranchName());
	   
		/*
		 * Branch y1= session.get(Branch.class,1l); pw.println(y1);
		 * pw.println(y1.getStudent()); pw.println();
		 */
		/*
		 * Student y2= session.get(Student.class,101l); pw.println(y2); pw.println();
		 */
		Session session=DbUtil.getSessionFactory().openSession();
		if(req.getServletPath().equals("/getstudentInfo")) {
		
	    
	   // List<Student> studentList= session.createQuery("From Student").list();
	  
	   
	   req.setAttribute("studentList", new StudentServiceImpl().getAllStudents());
	   req.setAttribute("branchList", new BranchServiceImpl().getAllBranches() );
	   req.setAttribute("scholarshipList", new ScholarshipServiceImpl().getAllScholarship());
	   
	  
	   req.getRequestDispatcher("studentInfo.jsp").forward(req, resp);
	  
	   
		}
	   
	}

}
