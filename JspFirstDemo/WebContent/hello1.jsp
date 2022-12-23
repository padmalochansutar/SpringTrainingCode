<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello jsp</h3>
	
	<%
		String rno = request.getParameter("rollNo");
	String name = request.getParameter("name");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "root");
	 Statement st=con.createStatement();
	 String count="insert into student (rollNo,name) values("+rno +",'"+name+"')";
	 int rs=st.executeUpdate(count);
	 if(rs!=0)
		 out.println("data is sucessfully inserted");
	 
	%>
</body>
</html>