<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.css"
	rel="stylesheet">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>
</head>
<body>

<div class="container  border border-stripped mt-2">
	<h1 align="center" style="color:blue">Application Details</h1>
	<form  action="./save"  method="post" onsubmit="return Validate()" enctype="multipart/form-data">
	<div class="row">
		<div class="col-md-4">
			 <label for="username">Service Provider Name<span
						style="color: red">*</span></label>
			 <select class="form-control" name="providerid" id="con" onchange="provider()" >
			 	<option value="0">-Select-</option>
	          <c:forEach items="${providerlist}" var="prov">
				<option value="${prov.providerid}">${prov.name }</option>
			</c:forEach>
			</select>
		</div>
		<div class="col-md-4">
			<label for="username"> Connection Speed<span
						style="color: red">*</span></label>
			 <select class="form-control" name="connectionid" id="connection"  >
			 	<option value="0">--Select--</option>
			 </select>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
		 <label for="username" > Name<span
						style="color: red">*</span></label>
          <input type="text" name="name"  class="form-control" placeholder="Enter Name" id="name" >
		</div>
		
		<div class="col-md-4">
		 <label for="username"> Email<span
						style="color: red">*</span></label>
          <input type="text" name="email"  class="form-control" placeholder="Enter Email" id="email">
		</div>
		<div class="col-md-4">
		 <label for="username"> Mobile No<span
						style="color: red">*</span></label>
          <input type="number" name="mobile" id="mobile" placeholder="Enter Mobile No" class="form-control" >
		</div>
	</div>
	<div class="row">
			<div class="col-md-4">
			 <label for="username"> Date of birth<span
						style="color: red">*</span></label>
	          <input type="text" class="form-control" placeholder="DD/MM/YYYY"
					 id="dob" name="dob">
			</div>
		
		<div class="col-md-4">
		 <label for="username"> Gender<span
						style="color: red">*</span></label> <br>
          &nbsp;&nbsp;<input type="radio" name="gender" value="male"  cheaked="cheaked" id="father">Male &nbsp;&nbsp;&nbsp;
          <input type="radio" name="gender" value="female"  cheaked="cheaked" id="father">FeMale
		</div>
		<div class="col-md-4">
		 <label for="username">upload address prove<span
						style="color: red">*</span></label>
		 <input type="file" name="image" class="form-control" id="address">
		</div>
	</div>
		<div class="row">
			<div class="col-md-4 mt-4">
	          <input type="submit" value="SAVE"  class="form-control btn btn-success" >
			</div>
			<div class="col-md-4 mt-4">
	          <input type="reset" value="CLEAR"  class="form-control btn btn-primary" >
			</div>
		</div>
	</form>
</div>
<div class="container border border-stripped mt-5" >
<h1 align="center" style="color:red">Registration Details</h1>
<form action="./getdetails">
<div class="row">
		<div class="col-md-4">
			 <label for="username"> provider</label>
			 <select class="form-control" name="providerid" id="con" >
			 	<option value="0">-Select-</option>
	          <c:forEach items="${providerlist}" var="role">
				<option value="${role.providerid}" <c:if test="${role.providerid} eq ${userdetail.provider_id.providerid}">selected="selected"</c:if>>${role.name }</option>
			</c:forEach>
			</select>
		</div>
		<div class="col-md-2 mt-4">
			<input type="submit" value="SEARCH"  class="form-control btn btn-success" >
		</div>
</div>
</form>
<table border="1" id="empTable" class="table table-striped">
				<thead>
					<tr>
					<th>#SL</th>
					<th>Name</th>
					<th>Email</th>
					<th>mobile</th>
					<th>document</th>
					<th>provider</th>
					<th>speed</th>
					<th>fees</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${data}" var="role" varStatus="count">

				<tr>
					<td>${count.count}</td>
					<td>${role.name }</td>
					<td>${role.email }</td>
					<td>${role.mobile }</td>
					<td>${role.image }</td>
					<td>${role.provider_id.name }</td>
					<td>${role.connection_id.speed }</td>
					<td>${role.connection_id.fees }</td>					
				</tr>
			</c:forEach>
				</tbody>




			</table>

	</div>

<script type="text/javascript">
$(document).ready(function() {
	$('#empTable').DataTable();
});

$('#dob').datepicker({
	format : 'dd/mm/yyyy'
});

function provider(){
	var contry=$("#con").val();
	

	$.ajax({
		type:"GET",
		url:"./connection",
		data:"con="+contry,
		success:function(response){
			
			$("#connection").html(response);
			}

		});

	}

function Validate() {
	let applicantName = document.getElementById("name").value;
	let emailId = document.getElementById("email").value;
	let mobileNo = document.getElementById("mobile").value;
	var validRegex = /^[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)$/;
	
	if (applicantName.length < 4) {
		alert("Name must be larger than 3 letters");
		return false;
	}
	
	if (!(isNaN(applicantName))) {
		alert("Name must be alphabets");
		return false;
	}
	if(!(emailId.match(validRegex))){
		alert("Enter a valid email");
		return false;
	}
	if (mobileNo.length == 10){
		 if(isNaN(mobileNo)){
			alert("Enter valid mobile no" );
			return false;
		} 
	}
	else{
		alert("moblie number must be 10 digit");
		return false;
	} 
	
	

	return true;
}

</script>



</body>
</html>