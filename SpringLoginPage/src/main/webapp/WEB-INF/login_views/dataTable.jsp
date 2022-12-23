<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
		<table border="1">
			<thead>
				<tr>
					<th>SLNO#</th>
					<th>STUDENT NAME</th>\
					<th>FEES</th>
					<th>DATE OF ADMISSION</th>
					<th>FILE</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${studentList }" var="student" varStatus="count">
					<tr>
						<td>${count.count }</td>
						<td>${student.name }</td>
						<td>${student.fees }</td>
						<td>${student.date }</td>
						<td>${student.file }</td>

					</tr>
				</c:forEach>

			</tbody>
		</table>
		<h3>
			<a href="./loginPage">NEW USER SIGIN</a>
		</h3>

	</form>

</body>
</html>