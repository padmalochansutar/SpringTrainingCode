package com.csmtech.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncListenableTaskExecutor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csmtech.domain.Course;

@Controller
public class MyController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
     @RequestMapping("/test")  
	public void jdbcTest(){
//		try {
//		Connection con=	jdbcTemplate.getDataSource().getConnection();
//		Statement st=con.createStatement();
//		ResultSet rs=st.executeQuery("select  employee_id,last_name,salary from employees" );
//		while(rs.next()) {
//			System.out.println(rs.getLong(1)+"  "+rs.getString(2)+" "+rs.getDouble(3));
//		}
//		rs.close();
//		st.close();
//		con.close();
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//	}
	
    //add records
//    Integer record= jdbcTemplate.update("insert into course(course_id,course_name,course_fees) values(5,'cd',345.00)");
//     if(record!=null) {
//    System.out.println(record);
//     }
    //Integer rup= jdbcTemplate.update("update course set course_name='java'  where course_id=4");
    // if(rup!=null) {
    //	 System.out.println(rup);
     //}
     Integer dre=jdbcTemplate.update("delete from course where course_id=4");
     if(dre!=null) {
    	 System.out.println(dre);
     }
     
     
     //prepared statement..
//     Integer record= jdbcTemplate.update("insert into course(course_id,course_name,course_fees) values(?,?,?)",5,"cd",354.00);
//     if(record!=null) {
//    System.out.println(record);
//     }
     //select statement(Query)
     
//     jdbcTemplate.query("select course_id,course_name,course_fees from course",new ResultSetExtractor(){
//
//		@Override
//		public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
//			while(rs.next()) {
//				System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
//			}
//			
//			return null;
//	
//     
//     });
     
    List<Course> cList= jdbcTemplate.query("select course_id,course_name,course_fees from course",new ResultSetExtractor<List<Course>>(){

		@Override
		public List<Course> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Course> courseList=new ArrayList<Course>();
			while(rs.next()) {
				Course course=new Course();
				course.setCourseId(rs.getLong(1));
				course.setCourseName(rs.getString(2));
				course.setCourseFees(rs.getDouble(3));
				courseList.add(course);
				
			}
			return courseList;
		}
    	 
     });
    cList.forEach(c->System.out.println(c));
     
     }
     }
     
     
     
     
     
     


