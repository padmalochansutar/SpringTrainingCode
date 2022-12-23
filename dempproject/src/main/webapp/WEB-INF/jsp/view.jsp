<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>
<center><h1>All details</h1></center>

	<div class="container">
	<form action="/search">
	<label>Select your region</label>
	<select class="form-control" name="id" id="id"
						>
						<!-- <option value="Select">Select</option> -->
						<c:forEach items="${listregion}" var="reg">
							<option value="${reg.id}">${reg.name}</option>

						</c:forEach>
					</select>
					<center><input type="submit" value="Search"></center>
					</form>
	<div class="table-container mt-4">
					<table class="table table-bordered" id="empTable">
						<thead>
							<tr>
								<th>S.No</th>
								<th>facultyname</th>
								<th>facultyaddress</th>
								<th>status</th>
								<th>id</th>
								
								<th colspan="2">Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${registrationList}" var="reg" varStatus="count">
								<tr>
									<td>${count.count}</td>
									<td>${reg.facultyname}</td>
									<td>${reg.facultyaddress}</td>
									
									<td>${reg.status}</td>
									
									<td>${reg.id}</td>
									<td><a href="./update?regid=${reg.regid}">EDIT</a>
									
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				</div>
				
		
	</script>
</body>
</html>