<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
${allActiveUsers }
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.12.1/css/datatables.bootsrap4.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>
	<div class="container mt-5 text-danger">
		<div class="display-4">User Registration Form</div>
		<form action="./saveUserForm" method="post" class="form-group"
			enctype="multipart/form-data" onsubmit="return validation()">
			<input type="hidden" name="userId" id="userId" value="${user.userId }">
			<div class="row">
				<div class="col-sm-4">
					<label class="text-primary" >User Name</label> <input type="text"
						name="userName" id="nameId" class="form-control" value="${user.userName }">
				</div>
				<div class="col-sm-4">
					<label class="text-primary">Email</label> <input type="email"
						name="email" id="emilId" class="form-control" value="${user.email }">
				</div>
				<div class="col-sm-4">
					<label class="text-primary">phone No</label> <input type="phone"
						name="mobileNo" id="phoneId" class="form-control" value="${user.mobileNo }">
				</div>
				
				
				<div class="col-sm-4 mt-2">
					<label for="roleId" class="text-primary">Role Name</label> 
						<select name="myRole" class="form-control" id="roleId">
						<option value="0">-select-</option>
						<c:forEach items="${allRoles }" var="role">
						<option value='${role.roleId }' <c:if test="${role.roleId eq user.myRole.get(0).roleId }">selected='selected'</c:if>>${role.roleName }</option>
					
						</c:forEach>
						</select>
				</div>
				
				
				
				
			</div>
			<div class="row">
				<div class="col-sm-2 mt-3">
					<input type="submit" <c:choose><c:when test="${user eq null }">value="save"</c:when><c:otherwise>value="update"</c:otherwise></c:choose>
						class="btn btn-success mt3 form-control">
				</div>
			</div>
		</form>

	</div>
	<div class="container mt-5 text-danger">
		<div class="display-4">User Data</div>
		<hr>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>SL#</th>
					<th>User Id</th>
					<th>User Name</th>
					<th>Email</th>
					<th>MobileNo</th>
					<th>User Type</th>
					<th>Fees</th>
					<th>Action</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allActiveUsers }" var="user" varStatus="count">
					<tr>
						<td>${count.count }</td>
						<td>${user.userId }</td>
						<td>${user.userName }</td>
						<td>${user.email }</td>
						<td>${user.mobileNo }</td>
						<td>${user.myRole.get(0).roleName }</td>
						<td>${user.myRole.get(0).fees }</td>
						<td><a href="./updateUser?userId=${user.userId}" class="btn btn-success">UPDATE</a>&nbsp;&nbsp;<a href="./deleteUser?userId=${user.userId}"  class="btn btn-danger">DELETE</a></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script type="text/javascript">





	</script>
	
	
	
	
</body>
</html>