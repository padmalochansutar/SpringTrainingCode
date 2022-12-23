<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>Student Info</h3>
		<form action="./saveStudent" method="post">
		<input type="hidden" name="rollNo" value="${upstudent.rollNo}">
			<div>
				<label>Name</label> <input type="text" name="name" value="${upstudent.studentName }">
			</div>
			<div>
				<label>Email</label> <input type="email" name="email" value="${upstudent.email}">
			</div>

			<div>
				<label>Date Of Admission</label> <input type="text" name="doa" value="${upstudent.doa }">
			</div>

			<div>
				<label>Branch</label> <select name="branchId">
					<option value="0">-select-</option>
					<c:forEach items="${branchList }" var="branch">
						<option value="${branch.branchId}">${branch.branchName}</option>
					</c:forEach>

				</select>

			</div>

			<div>
				<label>Scholarship</label> <select name="scholarshipId">
					<option value="0">-select-</option>
					<c:forEach items="${scholarshipList }" var="scholarship">
						<option value="${scholarship.scholarshipId}">${scholarship.scholarshipName}
						</option>
					</c:forEach>
				</select>

			</div>

			<div>
				<c:if test="${upstudent eq null }">
					<input type="submit" value="Save">
				</c:if>
				<c:if test="${upstudent ne null }">
					<input type="submit" value="Update">
				</c:if>
				<input type="submit" value="reset">
			</div>



		</form>


		<table border=1>
			<thead>
				<tr>
					<th>Sl#</th>
					<th>RollNo</th>
					<th>Name</th>
					<th>Email</th>
					<th>Date of Addmission</th>
					<th>Branch</th>
					<th>Scholarship</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${studentList }" var="student" varStatus="counter">
					<tr>
						<td>${counter.count }</td>
						<td>${student.rollNo }</td>
						<td>${student.studentName }</td>
						<td>${student.email}</td>

						<td><fmt:formatDate value="${student.doa}"
								pattern="yyyy.MM.dd " /></td>
						<td>${student.branch.branchName }</td>
						<c:if test="${student.scholarship.scholarshipName ne null }">
							<td>${student.scholarship.scholarshipName}</td>
						</c:if>
						<c:if test="${student.scholarship.scholarshipName eq null }">
							<td>Not applicable</td>
						</c:if>
						<td><a href="./update?rollNo=${student.rollNo }">Update</a></td>
					</tr>
				</c:forEach>




			</tbody>




		</table>
	</div>
</body>
</html>