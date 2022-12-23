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
		<div class="display-4">STUDENTS FORM</div>
		<form action="./saveData" method="post" class="form-group" enctype="multipart/form-data">
			<div class="row">
				<div class="col-sm-4">
					<label class="text-primary"s>NAME:</label>
					<input type="text"     name="name" id="nameId" class="form-control"> 
				</div>
				<div class="col-sm-4">
					<label class="text-primary">FEES:</label>
					<input type="number" name="fees"   id="feesId"  class="form-control"> 
				</div>
				<div class="col-sm-4">
					<label class="text-primary">DATE:</label>
					<input type="date" name="date"   id="dateId"  class="form-control"> 
				</div>
				
				<div class="col-sm-4">
					<label class="text-primary">FILE:</label>
					<input type="file"   name="file"  id="fileId" class="form-control"> 
				</div>
			</div>
			<div class="row">
				<div class="col-sm-2 mt-3">
					<input type="submit" value="save" class="btn btn-success mt3 form-control">
					</div>
				
			</div>
     
</body>
</html>