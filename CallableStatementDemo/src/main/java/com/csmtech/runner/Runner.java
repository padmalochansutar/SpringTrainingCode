package com.csmtech.runner;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.csmtech.util.DbUtil;

import jdk.internal.org.objectweb.asm.Type;


public class Runner {

	public static void main(String[] args) {
		Connection con=DbUtil.getDbConnection();
		ResultSet rs=null;
		try {
			//insert
//			CallableStatement cs=con.prepareCall("{call emp_procedure(?)}");//total record show
			/*
			 * CallableStatement
			 * cs1=con.prepareCall("{call emp_procedure(?,?,?,?,?,?)}");//calling a
			 * procedure//particular input record.. cs1.setString(1, "insert");//it is used
			 * to read value employee id of 5: cs1.setLong(2, 0l); cs1.setString(3,
			 * "Ashok"); cs1.setDouble(4, 3450.80); cs1.setDate(5, new java.sql.Date(1998,
			 * 05,23)); cs1.setLong(6, 1l);
			 */
			//update
			
			 /* CallableStatement cs1=con.prepareCall("{call emp_procedure(?,?,?,?,?,?)}");
			  
			  cs1.setString(1,"getsalid");
			  // cs1.setString(1, "update");
			  cs1.setLong(2,5l);
			   
			  //cs1.setString(3, "rahul"); 
			  cs1.setString(3,null);
			  cs1.setDouble(4,45000);
			 
			  //cs1.setDouble(4, Type.DOUBLE); 
			  cs1.setDate(5, null); cs1.setLong(6,0l);
			  //Integer noOfRecAffected=cs1.executeUpdate(); rs=cs1.executeQuery();
			  if(rs.next()==true) 
				  System.out.println(rs.getString(1));*/
			 
			//function
			CallableStatement cs1=con.prepareCall("{?=call getsalid_function(?)}");
			cs1.setLong(2, 1l);
			cs1.registerOutParameter(1, Types.DOUBLE);
			cs1.execute();
			System.out.println(cs1.getString(1)+" particular salary");
			//rs.close();
			cs1.close();
                 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.closeDbConnection();
	}

}
