package com.csmtech.controller;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.entity.Branch;
import com.csmtech.entity.Course;

import com.csmtech.entity.Employees;
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
		/*if(req.getServletPath().equals("/getstudentInfo")) {
		
	    
	   // List<Student> studentList= session.createQuery("From Student").list();
	  
	   
	   req.setAttribute("studentList", new StudentServiceImpl().getAllStudents());
	   req.setAttribute("branchList", new BranchServiceImpl().getAllBranches() );
	   req.setAttribute("scholarshipList", new ScholarshipServiceImpl().getAllScholarship());
	   
	  
	   req.getRequestDispatcher("studentInfo.jsp").forward(req, resp);
	  */
		 //Student x=session.get(Student.class, 101l);
		// Course c=session.get(Course.class,2l);
		// pw.println(c+""+c.getStudent());
	  
	  // pw.println(x);
		/*
		 * List<Employee> employeeList=session.createQuery("from Employee").list();
		 * 
		 * 
		 * 
		 * req.setAttribute("employeeList",employeeList);
		 * req.getRequestDispatcher("studentInfo.jsp").forward(req,resp);
		 */
//	    Employees e=session.get(Employees.class, 103);
//	    		pw.println(e.getDepartment().getLocations().getCity());
	   // List<Employees> employees = session.createQuery("From Employees").list();
		//Employees e=session.get(Employees.class, 103);
	  //  pw.println(e.getEmpid()+"   "+e.getLastName()+" "+e.getDepartment().getLocations().getCity());
		
		
		
Long totaRecords= (Long)session.createQuery("select count(*) from Employees").uniqueResult();
		
		if(req.getServletPath().equals("/getstudentInfo")) {
			session=DbUtil.getSessionFactory().openSession();
			Query<Employees> query= session.createQuery("from Employees");
			List<Employees> list=query.list();
			
			req.setAttribute("allempList", list);
			req.getRequestDispatcher("allEmp.jsp").forward(req, resp);
			/*
			 * // Course course =session.get(Course.class, 1l); //
			 * pw.println(course+" "+course.getStudent()); Integer
			 * offset=(Integer)req.getAttribute("pageNo"); if(offset==null) offset=0; Query
			 * query = session.createQuery("From Employees");
			 * 
			 * query.setFirstResult(offset); query.setMaxResults(10); List<Employees>
			 * employeesList = query.list();
			 * 
			 * List<Integer> pageNo = new ArrayList<Integer>(); for(int
			 * i=0;i<totaRecords;i=i+10) pageNo.add(i); req.setAttribute("pageNo", pageNo);
			 * req.setAttribute("empList", employeesList); //
			 * req.getRequestDispatcher("empInfo.jsp").forward(req, resp);
			 * req.getRequestDispatcher("Employee.jsp").forward(req, resp);
			 */
		
		
	    
	}
	   
	}
}


