<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>Student Enrollment Form</h3>
		<form action="./saveStudent" method="post">
			<div>
				<label>Name</label>
				<input type="text" name="name">
			</div>
			<div>
				<label>Email</label>
				<input type="email" name="email">
			</div>
			<div>
				<label>DOA</label>
				<input type="date" name="doa">
			</div>
			<div>
				<label>Branch</label>
				<select name="branchId">			
					<option value="0">-select-</option>	
					<c:forEach items="${branchList}" var="branch">
						<option value="${branch.branchId}">${branch.branchName}</option>	
					</c:forEach>
				</select>
			</div>
			<div>
			
				<label>Scholarship</label>
				<select name="scholarshipId">			
					<option value="0">-select-</option>	
					<c:forEach items="${scholarshipList}" var="scholarship">
						<option value="${scholarship.scholarshipId}">${scholarship.scholarshipName}</option>	
					</c:forEach>
				
				</select>
			</div>
			<div>
				<input type="submit">
				<input type="reset">
			
			</div>
		
		
		</form>
	
		<h3>Student Info</h3>
		<table border="1">
			<thead>
				<tr>
					<th>Sl#</th>
					<th>Roll No</th>
					<th>Name</th>
					<th>Email</th>
					<th>Date of Admi</th>
					<th>Branch</th>
					<th>Scholarship</th>
				</tr>			
			</thead>
			<tbody>
				<c:forEach items="${studentList}" var="student" varStatus="counter">
					<tr>
						<td>${counter.count }</td>
						<td>${student.rollNo }</td>
						<td>${student.name }</td>
						<td>${student.email }</td>
						<td>${student.doa }</td>
						<td>${student.branch.branchName }</td>
						<td>${student.scholarship ne null ? student.scholarship.scholarshipName :"<label style='color:red'> NA</label> "}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>