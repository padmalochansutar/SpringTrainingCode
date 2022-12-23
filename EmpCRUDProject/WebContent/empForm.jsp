<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>Emp Regd form</h3>
		<form action="./saveEmp" method="post">
			<input type="hidden" name="empId" value="${uemp.empId}">
			<div>
				<label>Name:</label> <input type="text" name="empName"
					value="${uemp.empName }">

			</div>
			<div>
				<label>Salary:</label> <input type="text" name="empSal"
					value="${uemp.salary }">

			</div>
			<div>
				<label>Hire Date:</label> <input type="text" name="empHireDate"
					value="<fmt:formatDate pattern="yyyy/MM/dd" type="date" value="${uemp.hireDate}" />">

			</div>


			<div>

				<label>Dept Id</label> <select name="empDeptId">
					<option value="0">--select--</option>
					<c:forEach items="${ deptList }" var="dept">
						<option value="${dept.deptId}"<c:if
								test="${dept.deptId eq uemp.deptId }"> selected="selected"</c:if>>${dept.deptName}
						</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<c:if test="${uemp eq null }">
					<input type="submit" value="Save">
				</c:if>
				<c:if test="${uemp ne null }">
					<input type="submit" value="Update">
				</c:if>
			</div>


		</form>
		<h3>Emp Details</h3>
		<table border="1">
			<thead>
				<tr>
					<th>Sl.#</th>
					<th>Emp Id</th>
					<th>Name</th>
					<th>Salary</th>
					<th>Hire Date</th>
					<th>Dept No</th>
					<th>action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${empList}" var="emp" varStatus="count">
					<tr>
						<td>${count.count }</td>
						<td>${emp.empId }</td>
						<td>${emp.empName }</td>
						<td>${emp.salary }</td>
						<td><fmt:formatDate type="date" value="${emp.hireDate}" /></td>
						<td>${emp.deptId }</td>
						<td><a href="./updateEmp?empId=${emp.empId }">update</a>&nbsp;<a
							href="./deleteEmp?empId=${emp.empId }">delete</a>
					</tr>

				</c:forEach>
			</tbody>
		</table>
</body>
</html>