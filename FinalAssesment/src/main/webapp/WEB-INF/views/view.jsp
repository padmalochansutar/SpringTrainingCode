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
<body style="background-color: LightGray">

<div class="container" class="form-group"
		style="margin-top: 25px; border: 1px solid black; background-color: lightGreen;">
	<form action="./save" method="post" enctype="multipart/form-data"
			onsubmit="return validation()">
			<center> College Addmission Form</center>
			<input type="hidden" name="id" id="id" value="${rg.id}">
			<label for="college" class="text-info">college name <span
						style="color: red">*</span></label> <select name="collegeid" id="collegeid"
						class="form-control">
						<c:forEach items="${listCollege}" var="college">
						
							<option value="${college.collegeid}"<c:if test="${college.collegeid eq rg.college.collegeid}">selected='selected'</c:if>>${college.name}</option>
						</c:forEach>

					</select>
					<label for="branch" class="text-info">Branch name <span
						style="color: red">*</span></label> <select name="branchid" id="branchid"
						class="form-control">
						<c:forEach items="${listBranch}" var="branch">
							<option value="${branch.branchid}" <c:if test="${branch.branchid eq rg.branch.branchid}">selected='selected'</c:if>>${branch.name}</option>
						</c:forEach>

					</select>
			<div class="row">
				<div class="col-sm-6">
					<label class="text-info">Student name <span
						style="color: red">*</span></label> <input type="text" name="name"
						id="name"  value="${rg.name}" class="form-control">
				</div>
				<div class="col-sm-6">
					<div class="col-sm-6">
					<label class="text-info">Email <span style="color: red">*</span></label>
					<input type="email" name="email" class="form-control" id="email"  value="${rg.email}">
				</div>
				</div>
			</div>
			<div class="row">
				


				<div class="col-sm-6">
					<label class="text-info">Mobile Number <span
						style="color: red">*</span></label> <input type="text" name="mobile"  value="${rg.mobile}"
						id="mobile" class="form-control">
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<label class="text-info">Date of Birth <span
						style="color: red">*</span></label> <input type="date" name="dob" id="dob"  value="${rg.dob}"
						class="form-control">
						
				</div>

				<div class="col-sm-6 mt-4">
					<label class="text-info">Gender <span style="color: red">*</span></label>
					<input type="radio" id="male" name="gender" value="Male" checked="checked"> <label
						for="Male">Male</label> <input type="radio" id="female"
						name="gender" value="Female"> <label for="css">Female</label><br>
				</div>
			</div>
			<div class="row">
				
				<div class="col-sm-6">
					<label class="text-info">Upload image <span
						style="color: red">*</span></label> <input type="file" name="image" 
						id="image" class="form-control"  value="${rg.image}">


				</div>
			</div>
			<div class="text-center mt-2">
				<input type="submit" value="Submit" class=" btn btn-success">
				<input type="reset" value="reset" class=" btn btn-secondary">
			</div>
			
			
		</form>
		<hr>
		<hr>
		<center> REGISTRATION DETAILS</center>
		<form action="./search">
		
		<label for="college" class="text-info">college name <span
						style="color: red">*</span></label> <select name="collegeid" id="collegeid"
						class="form-control">
						<c:forEach items="${listCollege}" var="college">
							<option value="${college.collegeid}">${college.name}</option>
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
						<th>Image</th>
						<th>College</th>
						<th>Branch</th>
					    <th>Fees</th>
					    <th>Action</th>



					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listreg}" var="reg" varStatus="count">
						<tr>
							<td>${count.count}</td>
							<td>${reg.name}</td>
							<td>${reg.email}</td>
							<td>${reg.mobile}</td>
							<td>${reg.image}</td>
							<td>${reg.college.name}</td>
							<td>${reg.branch.name}</td>
							<td>${reg.branch.fees}</td>
							<td><a href="./update?id=${reg.id}">Update</a>&nbsp;&nbsp;&nbsp;<a href="./delete?id=${reg.id}"">Delete</a></</td>
							

							<%-- <td>${stud.Membership.membershipfee} --%>
						</tr>
					</c:forEach>
				</tbody>




			</table>
		</div>
		<script type="text/javascript">
		$(document).ready(function() {
			$('#empTable').DataTable();
		});

		function validation()
		{
			let name = document.getElementById("name").value;
			let mobile = document.getElementById("mobile").value;
			let email = document.getElementById("email").value;
			let dob = document.getElementById("dob").value;
			let imageId = document.getElementById("image").value;
			var validRegex = /^[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)$/;
			if (mobile.length == 10){
				 if(isNaN(mobile)){
					alert("Enter valid mobile no" );
					return false;
				} 
			}
			
			if (name == "" || name.length < 3) {
				alert("name must contain some letter")
				return false;
			}
			 else{
				if(isNaN(letter)){
					}
				else{
					return false;
					}
				} 
						
			
			if(!(email.match(validRegex))){
				alert("Enter a valid email");
				return false;
			}
			
			
			else{
				alert("moblie number must be 10 digit");
				return false;
			} 
			
			if (document.getElementById("male").checked == false
					&& document.getElementById("female").checked == false) {
				alert("gender is not selected");
				return false;
			} 
			
			if(imageId ==" "){
				alert(" please Upload a file");
				return false;
				}

			return true;
		}
	</script>
	
</body>

</html>