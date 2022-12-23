package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


import javax.security.auth.x500.X500Principal;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.el.parser.AstGreaterThanEqual;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.dao.ScholarshipDaoImpl;
import com.csmtech.dbutil.DbUtil;
import com.csmtech.entity.Branch;
import com.csmtech.entity.Course;
import com.csmtech.entity.Employees;
import com.csmtech.entity.Scholarship;
import com.csmtech.entity.Student;
import com.csmtech.service.BranchServiceImpl;
import com.csmtech.service.StudentServiceImpl;

public class FrontController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		Session session = DbUtil.getSessionFactory().openSession();
//		pw.println(session.createQuery("From Branch").list());
//		pw.println(session.createQuery("From Scholarship").list());
//		List<Student> studentList =  session.createQuery("From Student").list();
		
		
		
//		Student x = session.get(Student.class, 101L);
//		pw.println(x);
//		for (Student student : studentList) {
//			pw.println(student.getScholarship().getScholarshipName());
//			
//		}
		
//		Student b = session.get(Student.class, 101L);
//		pw.println(b+" "+b.getScholarship().getScholarshipName()+" "+b.getBranch().getBranchName());
		
//		for branch side one many relation
		
//		Branch b = session.get(Branch.class, 1L);
//		pw.println(b);
//		pw.println(b.getStudent());
//		pw.println(b.getStudent().forEach(s->pw.println(s.getName())));
		
		
//		for scholarship side one to one relation
		
//		Scholarship x =  session.get(Scholarship.class, 1l);
//		pw.println(x+" "+x.getStudent());
		Long totaRecords= (Long)session.createQuery("select count(*) from Employees").uniqueResult();
		
		if(req.getServletPath().equals("/getStudentInfo")) {
//			Course course =session.get(Course.class, 1l);
//			pw.println(course+" "+course.getStudent());
			Integer offset=(Integer)req.getAttribute("pageNo");
			if(offset==null)
				offset=0;
			Query query = session.createQuery("From Employees");
			
			query.setFirstResult(offset);
			query.setMaxResults(10);
			List<Employees> employeesList = query.list();
			
			List<Integer> pageNo = new ArrayList<Integer>();
			for(int i=0;i<totaRecords;i=i+10)
				pageNo.add(i);
			req.setAttribute("pageNo", pageNo);
			req.setAttribute("empList", employeesList);	
//			req.getRequestDispatcher("empInfo.jsp").forward(req, resp);
			req.getRequestDispatcher("Employee.jsp").forward(req, resp);
			
			
			
//			pw.println("EmployeeId"+" "+"Employee Last Name"+" "+"Employee ManagerId");
//			pw.println(employees.getEmpId()+" "+employees.getLastName()+" "+employees.getManagerId());
//		List<Student> students = session.createQuery("From Student").list();
//		pw.println(students);
//		req.setAttribute("studentList",new StudentServiceImpl().getAllStudent());
//		req.setAttribute("branchList",new BranchServiceImpl().getAllBranch());
//		req.setAttribute("scholarshipList", new ScholarshipDaoImpl().getAllScholarship());
//		req.getRequestDispatcher("studentinfo.jsp").forward(req, resp);
		
		}
	}

}
