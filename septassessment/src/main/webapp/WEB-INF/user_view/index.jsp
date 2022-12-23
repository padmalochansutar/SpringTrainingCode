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
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	
</head>
<body style="background-color: LightGray">

<div class="container" class="form-group"
		style="margin-top: 25px; border: 1px solid black; background-color: lightGreen;">
	<form action="./save" method="post" enctype="multipart/form-data"
			onsubmit="return validation()">
			<center> Cable TV Registration Form</center>
			<ul class="nav nav-tabs">
              <li class="active"><a href="index" >Add</a></li>
              <li><a href="./view">View</a></li>            
            </ul>
			<%-- <input type="hidden" name="id" id="id" value="${rg.id}"> --%>
			<label for="college" class="text-info">Provider name <span
						style="color: red">*</span></label> <select name="providerid" id="providerid"
						class="form-control">
						<c:forEach items="${listprovider}" var="role">
							<option value="${role.proid}">${role.name}</option>
						</c:forEach>

					</select>
					<label for="branch" class="text-info">Subscription For <span
						style="color: red">*</span></label> <select name="subscription" id="subscription"
						class="form-control" onchange="getfees()">
						<c:forEach items="${listTime}" var="branch">
							<option value="${branch.subid}">${branch.time}</option>
						</c:forEach>

					</select>
					<div class="col-md-4 control-label">
								<label class="form-label control-label">Subscription fee<span
									class="text-danger">*</span></label> <input type="text" name="fees"
									id="fees" class="form-control" readonly>


							</div>
			<div class="row">
				<div class="col-sm-6">
					<label class="text-info"> Name <span
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
						style="color: red">*</span></label> <input type="text" name="mobile" onclick="blockSpecialAlphabet()"  value="${rg.mobile}"
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
					<label class="text-info">Upload Address Proof <span
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
		</div>
<!-- <script type="text/javascript">
$.ajax({
	 type: "get",
    url : "fetchprice",
    data: dataString,
		success:function(data){
			$("#price").val(data);
		},//success end
	
    });


</script> -->
<script type="text/javascript">
function validation()
{
	let name = document.getElementById("name").value;
	let mobile = document.getElementById("mobile").value;
	let email = document.getElementById("email").value;
	let dob = document.getElementById("dob").value;
	let imageId = document.getElementById("image").value;
	var validRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
	if (mobile.length == 10){
		 if(isNaN(mobile)){
			alert("Enter valid mobile no" );
			return false;
		} 
	}
	
	if (name == "" || name.length < 3) {
		swal("name must contain some letter")
		return false;
	}
	
				
	
	else if(!(email.match(validRegex))){
		alert("Enter a valid email");
		return false;
	}
	
	
	else {
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
function getfees() {
	var provider = $("#subscription").val();
	$.ajax({
		type : "GET",
		url : "./getFees",
		data : "provider=" + provider,
		success : function(response) {
			$("#fees").val(response);
		}

	});
	function blockSpecialAlphabet(e){
		
		var regex = new RegExp("^[A-Za-z,\\s]+$");
	    var str = String.fromCharCode(!e.charCode ? e.which : e.charCode);
	    if (regex.test(str)) {
	       return true;
	   }
	    return false;
	}
}


</script>
		
</body>


</html>