<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>Student Info</h3>
		

		


		<table border=1>
			<thead>
				<tr>
					<th>empid</th>
					<th>last name</th>
					<th>manager id</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employeeList }" var="emp" >
					<tr>
						<td>${emp.empid }</td>
						<td>${emp.lastName }</td>
						<td>${emp.manager.empid }</td>
						 
					</tr>
				</c:forEach>




			</tbody>




		</table>
	</div>
</body>
</html>