<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.12.1/css/datatables.bootsrap4.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>
     <form action>
	<table border="1">
		<thead>
			<tr>
				<th>SLNO#</th>
				<th>USERNAME</th>
				<th>GENDER</th>
				<th>BRANCH</th>
				<th>ACTION</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${userList }" var="user" varStatus="count">
				<tr>
					<td>${count.count }</td>
					<td>${user.name }</td>
					<td>${user.gender }</td>
					<td>${user.branch }</td>
					<td><a href="./updateUser?userId=${user.userId }" class="btn btn-success">UPDATE</a>&nbsp;&nbsp;<a href="./deleteUser?userId=${user.userId }" class="btn btn-danger">DELETE</a>
					
				</tr>
			</c:forEach>
		
		</tbody>
	</table>



</body>
</html>