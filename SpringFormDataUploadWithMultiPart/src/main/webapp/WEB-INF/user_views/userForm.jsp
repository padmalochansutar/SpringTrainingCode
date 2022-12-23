<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.12.1/css/datatables.bootsrap4.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>
	<div class="container mt-5 text-danger">
		<div class="display-4">User Form</div>
		<form action="./saveUser" method="post" class="form-group" enctype="multipart/form-data">
			<div class="row">
				<div class="col-sm-4">
					<label class="text-primary"s>Name</label>
					<input type="text" id="nameId" name="nameId" class="form-control"> 
				</div>
				<div class="col-sm-4">
					<label class="text-primary">Application Date</label>
					<input type="date" id="dateId" name="dateId" class="form-control"> 
				</div>
				<div class="col-sm-4">
					<label class="text-primary">Upload Image</label>
					<input type="file" id="ImageId" name="imageId" class="form-control"> 
				</div>
			</div>
			<div class="row">
				<div class="col-sm-2 mt-3">
					<input type="submit" value="save" class="btn btn-success mt3 form-control">
				</div>
			</div>
		</form>
		<table border="1" class ="table table-striped" id="userTableId">
		<thead>
		<tr>
		<th>SLNO#</th>
		<th>FORMID</th>
		<th>NAME</th>
		<th>APPLIED DATE</th>
		<th>USERPIC</th>
				</tr>
		
		</thead>
		<tbody>
			<c:forEach items="${userList }" var="user" varStatus="count">
				<tr>
					<td>${count.count }</td>
					<td>${user.formId }</td>
					<td>${user.name }</td>
					<td>${user.appliedDate }</td>
					<td>${user.userPic }</td>
					
				</tr>
			</c:forEach>
		
		</tbody>
		
		
		</tr>
		
		
		
		</thead>
		
		
		</table>
	</div>
	
	
</body>
<script type="text/javascript">
$(document).ready(function (){
	$('#userTableId').DataTable();
});

</script>
</html>