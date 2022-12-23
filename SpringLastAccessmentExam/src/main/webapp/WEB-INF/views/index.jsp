<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.12.1/css/datatables.bootsrap4.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script>


</head>

<body>
	<div class="container border color bg-info ">
		<div class="height:10%"></div>
		<h1 class="text-danger">${data }</h1>

		<h2 class="text-center text-danger">STUDENT REGISTATION DETAILS</h2>
		<form action="./saveData" method="POST" enctype="multipart/form-data"
			onsubmit="return valiatedForm()">

             <div class="row mt-5">
			<div class="col-sm-3">
				<label class="text-secondary text-warning">College Name:</label><span
						class="text-danger">*</span><br>
				<select name="collegeId" onchange="return college()" id="collegeId">
					<option value="0">-SELECT-</option>
					<c:forEach items="${collegeList }" var="college">
						<option value="${college.collegeId }">${college.collegeName }</option>
					</c:forEach>
				</select>
			</div>

			<div class="col-sm-3">
				<label class="text-secondary text-warning"> Branch Name:</label><span
						class="text-danger">*</span><br>
				<select name="branch" id="branchData">
					<option value="0">--select--</option>

				</select>
			</div>
			</div>
			<div class="row mt-5">
				<div class="col-sm-3">
					<label class="text-secondary text-warning div-to-align"> Name:</label><span
						class="text-danger">*</span><br> <input type="text"
						name="applicantName" id="nameId">
				</div>
				<div class="col-sm-3">
					<label class="text-secondary text-warning">Email:</label><span
						class="text-danger">*</span><br> <input type="email"
						name="emailId" id="dateId">
				</div>

				<div class="col-sm-3">

					<label class="text-secondary text-warning">Mobile Number:</label><span
						class="text-danger">*</span> <input type="text" name="mobileNo"
						id="addharId">
				</div>
				<div class="col-sm-3">
					<label class="text-secondary text-warning">Date of Birth:</label><span
						class="text-danger">*</span> <input type="text" name="dob"
						id="pinId" class="form-control datepicker">
				</div>
				<div class="col-sm-3">
					<label class="text-secondary text-warning">GENDER:</label><br> <input type="radio" name="gender"
						value="male"
						<c:if test='${upd.gender.equals("male") }'>checked="checked"</c:if>>
					MALE <input type="radio" name="gender" value="female"
						<c:if test='${upd.gender.equals("female") }'>checked="checked"</c:if>>FEMALE

				</div>
				<div class="col-sm-3">
					<label class="text-secondary text-warning"> Upload Photo:</label><span
						class="text-danger">*</span> <input type="file" name="image"
						id="fileId">
				</div>
			</div>
			<br>
			<div align="center">
				<input type="submit" value="Submit" class="btn-success">&nbsp;&nbsp;<input
					type="reset" value="Reset" class="btn-danger">
			</div>

		</form>
	</div>

	<script type="text/javascript">
		function college() {
			var college = $("#collegeId").val();

			$.ajax({
				type : "GET",
				url : "./getCollegeId",
				data : "collegeBranch=" + college,

				success : function(response) {

					$("#branchData").html(response)

				}

			});
		}
	</script>
	<script type="text/javascript">
		$(function() {
			$('.datepicker').datepicker({
				format : 'dd-mm-yyyy'
			});

		});
	</script>
   <script type="text/javascript">
		function valiatedForm() {

			let n = document.getElementById("nameId").value;
			let letters = /[^A-Za-z]+$/;
			let upper = /^[A-Z]/;

			if (letters.test(n)) {
				alert("Give Only Alphabet");
				return false;
			} else if (n == "") {
				alert("Not Balank name");
				return false;
			}
			if (n[0].toUpperCase() != n[0]) {
				//alert("sucessful name");
				alert("Give the first character capital");
				return false;
			}
			
			return true;
		}
	</script>
</body>
</html>