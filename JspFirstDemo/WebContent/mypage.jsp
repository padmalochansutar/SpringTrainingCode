<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>this is mypage.jsp</h3>

	<table border="1">
		<thead>
			<tr>
				<th>Sl.#</th>
				<th>ISBN</th>
				<th>TITLE</th>
				<th>PRICE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${booklist}" var="book" varStatus="i">
				<tr>
					<td>${i.index}</td>
					<td>${book.isbn}</td>
					<td>${book.title}</td>
					<td>${book.price}</td>
				</tr>
		</c:forEach>
				</tbody>
		</table>



	
</body>
</html>