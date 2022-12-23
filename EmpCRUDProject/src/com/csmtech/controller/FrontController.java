package com.csmtech.controller;

import java.io.IOException;



import java.io.PrintWriter;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.csmtech.entity.Dept;
import com.csmtech.entity.Emp;
import com.csmtech.service.EmpServiceImpl;

public class FrontController extends HttpServlet {
		private Configuration cnf=null;
		private  SessionFactory sessionfactory;
		private Session session;
		private Query<Dept> query;
		@Override
		public void init() throws ServletException {
			
			cnf = new Configuration();
			cnf.addAnnotatedClass(Emp.class);
			cnf.addAnnotatedClass(Dept.class);
			sessionfactory = cnf.buildSessionFactory();
		    
			session= sessionfactory.openSession();
			
		}
		
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    resp.setContentType("text/html"); 
		    if(req.getServletPath().equals("/getEmpForm")) {
		    	query=session.createQuery("from Dept");
		    	List<Dept> deptList= query.list();
		    	System.out.println(deptList);
		    	req.setAttribute("deptList", deptList);
		    	//all data display------
		    	req.setAttribute("empList", new EmpServiceImpl().getAllEmps());
		    	//---------
		    	req.getRequestDispatcher("empForm.jsp").forward(req, resp);
		    }
			
	}
		@Override
		public void destroy() {
			session.close();
		}

}
