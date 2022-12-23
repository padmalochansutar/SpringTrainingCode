<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >

	    <table border=1>
		<thead>
			<tr>
				<th>SLNO#</th>
				<th>StateName</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${stateList }" var="state" varStatus="count" >
				<tr>
					<td>${count.count }</td>
					<td>${state.name }</td>
				</tr>
			</c:forEach>
		</tbody>
</body>
</html>