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
	<div align="center">
		<h3>Salary Processing Form</h3>
		<Form action="./process" method="post">
			<div>
				<label>Emp Name</label> <select name="empId">
					<option value="0">-select-</option>
					<c:forEach items="${empList }" var="emp">
						<option value="${emp.empId }">${emp.empName }</option>
					</c:forEach>
				</select>
			</div>

			<div>
				<label>Month</label> <select name="month">
					<option value="0">-select-</option>
					<c:forEach items="${months }" var="mn">
						<option value="${mn }">${mn }</option>

					</c:forEach>

				</select>
			</div>

			<div>
				<label>Year</label> <select name="year">
					<option value="0">-select-</option>
					<c:forEach items="${years }" var="yr">
						<option value="${yr }">${yr }</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<label>Bonus</label> <input type="text" name="bonus"> </select>
			</div>
			<div>
				<input type="submit" value="Process"> </select>
			</div>





		</Form>







	</div>

</body>
</html>