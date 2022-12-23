package com.csmtech.runner;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.csmtech.util.DbUtil;

public class Runner {

	public static void main(String[] args) throws SQLException {

		/*
		 * Properties properties=new Properties(); try { properties.load(new
		 * FileReader("src/main/resources/db.properties")); } catch ( IOException e) {
		 * e.printStackTrace();
		 * 
		 * } System.out.println(properties.getProperty("driver_class_name"));
		 * System.out.println(properties.getProperty("url"));
		 * System.out.println(properties.getProperty("user_name"));
		 * System.out.println(properties.getProperty("password"));
		 * 
		 * Scanner sc=new Scanner(System.in); Connection con=DbUtil.getDbConnection();
		 * con.setAutoCommit(false); // Statement st= con.createStatement(); Statement
		 * st=null; PreparedStatement ps=null; Character choice; try { do {
		 * //addBatch():-used to store data in database like executeupadte() method
		 * String deptName; System.out.println("Enter the department name");
		 * deptName=sc.nextLine(); //prepared statement using batch
		 * ps=con.prepareStatement("insert into dept(dept_name) values(?)");
		 * 
		 * ps.setString(1, deptName); ps.addBatch(); //statement using insert
		 * //st.addBatch("insert into dept(dept_name) values('"+deptName+"')");
		 * st.addBatch("insert into dept(dept_name) values('Production1')");
		 * st.addBatch("insert into dept(dept_name) values('pre-sales1')");
		 * System.out.println("want to insert  more department [y/n]");
		 * choice=sc.nextLine().charAt(0); }while(choice=='y'); int[]
		 * res=ps.executeBatch(); }catch(SQLException sqle) {
		 * System.out.println(sqle.getMessage()); con.rollback(); } con.commit(); //
		 * st.clearBatch(); ps.clearBatch();
		 * 
		 * 
		 * // System.out.println(Arrays.toString(res));
		 */
		//metadata
		Connection con=DbUtil.getDbConnection();
		DatabaseMetaData metadata=con.getMetaData();
		System.out.println(metadata.getDatabaseProductName());
		System.out.println(metadata.getDatabaseMajorVersion()+"."+metadata.getDatabaseMinorVersion());
		System.out.println(metadata.getDriverMajorVersion());
		//Resultset metadata
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from emp");
	    ResultSetMetaData resultSetmetData=rs.getMetaData();
	    System.out.println(resultSetmetData.getColumnCount());
	    for(int i=1;i<=resultSetmetData;getColumnCount()++)
	}

}
