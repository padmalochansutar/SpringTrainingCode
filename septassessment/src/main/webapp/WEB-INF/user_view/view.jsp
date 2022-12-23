<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<h1>Working</h1>
<div class="container">
<center> REGISTRATION DETAILS</center>
		<form action="./search">
		
		<label for="college" class="text-info">Provider name <span
						style="color: red">*</span></label> <select name="providerid" id="providerid"
						class="form-control">
						<c:forEach items="${listprovider}" var="college">
							<option value="${college.proid}">${college.name}</option>
						</c:forEach>

					</select>
					
					<label for="college" class="text-info">Subscription For <span
						style="color: red">*</span></label> <select name="subscription" id="subscription"
						class="form-control">
						<c:forEach items="${listTime}" var="college">
							<option value="${college.subid}">${college.time}</option>
						</c:forEach>

					</select>
					<center><input type="submit" value="Search"></center>
					</form>
					
					
		<table border="1" id="empTable" class="table table-striped">
				<thead>
					<tr>

						<th>slno</th>
						<th>Name</th>
						<th>Email</th>
						<th>Mobile No</th>
						<th>Date</th>
						<th>Doucument</th>
						<th>Provider Name</th>
					    <th>Subscription Time</th>



					</tr>
				</thead>
				<tbody>
					<c:forEach items="${userList}" var="reg" varStatus="count">
						<tr>
							<td>${count.count}</td>
							<td>${reg.username}</td>
							<td>${reg.email}</td>
							<td>${reg.mobile}</td>
							<td>${reg.dob}</td>
							<%-- <td>${reg.upload}</td> --%>
							<td><a
									href="/downloadFile?id=${reg.id}">${reg.upload}</a></td>
							<td>${reg.provider.name}</td>
							<td>${reg.subscriptiontime.time}</td>
							<%-- <td>${reg.branch.time}</td> --%>
							

							<%-- <td>${stud.Membership.membershipfee} --%>
						</tr>
					</c:forEach>
				</tbody>




			</table>
		</div>
		</div>
		<script type="text/javascript">
		$(document).ready(function() {
			$('#empTable').DataTable();
		});
		</script>
</body>
</html>