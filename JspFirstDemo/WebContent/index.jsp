<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--<c:if test="${15>6}"> --%>
		<%="working.."%>
		<h3>Sample form</h3>
		<form action=./hello1.jsp>
			<div>
				<label>roll_no</label> <input type="text" name="rollNo">
			</div>

			<div>
				<label>name</label> <input type="text" name="name">
			</div>


			<div>

				<input type="submit" value="send">
			</div>

		</form>
</body>
</html>