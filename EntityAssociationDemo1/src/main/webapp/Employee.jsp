<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
</head>
<body>
<div align="center" class="container">
<h3>Employee Info</h3>
		<table border="1" class ="table table-striped">
			<thead>
				<tr>
					<th>Sl#</th>
					<th>EmpId</th>
					<th>Last Name</th>
					<th>Manager Name</th>
					<th>City</th>
					
					

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${empList }" var="emp" varStatus="counter">
					<tr>
						<td>${counter.count }</td>
						<td>${emp.empId }</td>
						<td>${emp.lastName }</td>
						<c:if test="${emp.managerId ne null}"><td>${emp.managerId.lastName }</td></c:if>
						<c:if test="${emp.managerId eq null}"><td>No Manager</td></c:if>
						<td>${emp.department.location.city }</td>
						
					</tr>

				</c:forEach>
			</tbody>
		</table>
		<c:forEach items="${pageNo }" var="no">
			<a href="./paginationDemo?pageNo=${no}" class="btn btn-success"><fmt:formatNumber type="number" pattern="##" value="${no/10+1}" /> &nbsp </a>
		</c:forEach>
		
		</div>

</body>
</html>