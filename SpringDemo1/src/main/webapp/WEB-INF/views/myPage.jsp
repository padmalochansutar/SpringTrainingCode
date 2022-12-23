<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
	 <table border=1 >
		<thead>
			<tr>
				<th>SLNO#</th>
				<th>CountryName</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${countryList }" var="country" varStatus="count">
				<tr>
					<td>${count.count }</td>
					<td>${country.name }</td>
				</tr>
			</c:forEach>
		</tbody>
</body>
</html>