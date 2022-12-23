package com.csmtech.runner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.csmtech.util.DbUtil;

public class EmployeesRunner {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		con=DbUtil.getDbConnection();
		try {
			st=con.createStatement();
			String selectQuery="select employee_id,first_name,email ,salary as max_avg_salary from employees  order by salary desc";
			ResultSet rs=st.executeQuery(selectQuery);
			while(rs.next()) {
				System.out.println("employee_id="+rs.getString(1)+" first_name="+rs.getString(2)+" email="+rs.getString(3)+" max_avg_salary ="+rs.getString(4));
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
