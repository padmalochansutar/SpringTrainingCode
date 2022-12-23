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

public class StudentController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student=new  Student();
         student.setStudentName(req.getParameter("name"));
         student.setEmail(req.getParameter("email"));
         try {
			student.setDoa(new SimpleDateFormat("yyyy.MM.dd").parse(req.getParameter("doa")));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
         
        
         
        
         student.setBranch(new BranchServiceImpl().getBranchById(Long.parseLong(req.getParameter("branchId"))));
         student.setScholarship(new ScholarshipServiceImpl().getScholarshipById(Long.parseLong(req.getParameter("scholarshipId"))));
        // Scholarship scholarship=new Scholarship();
        // scholarship.setScholarshipId(Long.parseLong(req.getParameter("scholarshipId")));
        // student.setScholarship(scholarship);
        // new ScholarshipServiceImpl().getScholarshipById(student);
         new StudentServiceImpl().saveStudent(student);
         //req.getRequestDispatcher("UpdateController").forward(req,resp);
         resp.sendRedirect("./getstudentInfo");
	}

}
