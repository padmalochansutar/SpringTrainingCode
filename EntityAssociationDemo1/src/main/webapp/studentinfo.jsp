<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>Student Enrollment Form</h3>
		<form action="./saveStudent" method="Get">
			<div>
				<label>Name</label> <input type="text" name="name"
					value="${stdroll.name }">

			</div>
			<div>
				<label>Email</label> <input type="email" name="email"
					value="${stdroll.email }">

			</div>
			<div>
				<label>Date Of Admission</label> <input type="text" name="doa"
					value="${stdroll.doa }">

			</div>
			<div>
				<label>Branch</label> <select name="branchId">
					<option value="0">---SELECT---</option>
					<c:forEach items="${branchList}" var="branch">
						<option value="${branch.branchId }"><c:if test="${branch.branchId eq stdroll.branch.branchId }">selected="selected"</c:if>${branch.branchName}</option>

					</c:forEach>
				</select>

			</div>
			<div>
				<label>Scholarship</label> <select name="scholarshipId">
					<option value="0">---SELECT---</option>
					<c:forEach items="${scholarshipList}" var="sch">
						<option value="${sch.scholarshipId }"><c:if test="${sch.scholarshipId eq stdroll.scholarship.scholarshipId }">selected="selected"</c:if>${sch.scholarshipName}</option>
					</c:forEach>
				</select>

			</div>
			<div>
			<c:if test="${stdroll eq null }">
							<input type="submit" value="save">
							<input type="submit"value="reset">
						</c:if>
						<c:if test="${stdroll ne null }">
							<input type="submit" value="update">
							<input type="submit"value="reset">
						</c:if>
						
				
				
			</div>

		</form>

		<h3>Student Info</h3>
		<table border="1">
			<thead>
				<tr>
					<td>Sl#</td>
					<td>Roll No</td>
					<td>Name</td>
					<td>Email</td>
					<td>doa</td>
					<td>Branch Name</td>
					<td>Scholarship</td>
					<td>Action</td>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${studentList }" var="student" varStatus="counter">
					<tr>
						<td>${counter.count }</td>
						<td>${student.rollNo }</td>
						<td>${student.name }</td>
						<td>${student.email }</td>
						<td><fmt:formatDate pattern="dd/MM/YYYY"
								value="${student.doa }" /></td>
						<td>${student.branch.branchName }</td>
						<c:if test="${student.scholarship.scholarshipName ne null}">
							<td>${student.scholarship.scholarshipName }</td>
						</c:if>
						<c:if test="${student.scholarship.scholarshipName eq null}">
							<td>---Not Applicable---</td>
						</c:if>
						
						<td><a
							href="./updateStudent?rollNo=${student.rollNo }">update</a>&nbsp<a
							href="./deleteStudent?rollNo=${student.rollNo }">delete</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>