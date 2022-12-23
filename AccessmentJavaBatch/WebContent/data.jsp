<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALL DATA</title>
</head>
<body>
<form action="./user">
<table border="1">

		<tr>
			<th>Name</th><th>Address</th><th>phone</th><th>email</th><th>Type</th>
		</tr>
		<c:forEach items="${Admin }" var="res" >
			<tr>
			<td>${res.name}</td>
			<td>${res.address}</td
			><td>${res.phone }</td>
			<td>${res.email}</td>
			<td>${res.type}</td>
			</tr>
		</c:forEach>
	</table>
	</form>
</body>
</html>