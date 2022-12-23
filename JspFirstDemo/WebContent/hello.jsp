<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%--This is a sample jsp page --%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello Jsp</h3>
	<%--This is a sample jsp page --%>
	<%!int b = 0;%>
	<h2>
		<%
			System.out.println(b);
		out.println(b++);
		int a = 15;
		out.println(a);
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			out.println("hello");

		}
		out.println(new Date());
		%>
	</h2>
	<%!Date d = new Date();%>
	<label>Some label</label>
	<h1>
		<%
			out.println("Second Scriptlet");
		out.println(d);
		%>
	</h1>
	<%="Hello my program"%>

	<table border="1">
		<thead>
			<tr>
				<th>sl.no</th>
				<th>name</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < 5; i++)
				out.println("<tr><td>1</td><td>name</td></tr>");
			%>

			<%=new SimpleDateFormat("MM/dd/yyyy").format(new Date())%>

		</tbody>
</table>

<%--JSP implicit object --%>



</body>
</html>