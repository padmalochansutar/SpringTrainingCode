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
	
	<!-- <script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script> -->
	

</head>

<body>

	

	<div class="container border color bg-info ">
		<div class="height:10%">
			<p align="right">
				<span class="text-danger">*</span> indicates mandatory fields
			</p>
			<h2 align="center">STUDENT REGISTARTION  FORM</h2>

		</div>
		 <h1 class="text-danger">${data }</h1>
		<form action="./saveData" method="POST" enctype="multipart/form-data" onsubmit="return valiadate();">
		<div ><p class="text-danger" id="addharNo"></p></div>
			<div class="row mt-5">
	         <div class="col-sm-3"> 
	        <label class="text-secondary text-warning">Student Name:</label><span class="text-danger">*</span>
	         <input type="text" name="stName" id="nameId">
	         </div>	
	          <div class="col-sm-3"> 
	        <label class="text-secondary text-warning">Student Dob:</label><span class="text-danger">*</span><br>
	         <input type="date" name="stDob" id="dateId" >
	         </div>	
	         
	          <div class="col-sm-3"> 
	         
	        <label class="text-secondary text-warning">Student Addhar Number:</label><span class="text-danger">*</span>
	         <input type="text" onchange="addhar_number()" name="addhar" id="addharId">
	         </div>
	         <div class="col-sm-3"> 
	        <label class="text-secondary text-warning">Student Pincode:</label><span class="text-danger">*</span>
	         <input type="text" name="pincode" id="pinId">
	         </div>
	          <!-- <div class="col-sm-3"> 
	        <label class="text-secondary text-warning">Student File:</label><span class="text-danger">*</span>
	         <input type="file" name="pic" id="fileId">
	         </div>	 -->	
			
				<div class="col-sm-3">
					<label class="text-secondary text-warning">Department Name:</label><br>
					<select name="deptId" id="deptId" onchange="return department()">
						<option value="0">-select-</option>
						<c:forEach items="${departmentList }" var="department">
							<option value="${department.deptId }">${department.deptName }</option>
						</c:forEach>
					</select>
				</div>

				<div class="col-sm-3">
					<label class="text-secondary text-warning"> Course Name:</label><br>
					<select name="courseId" id="courseData">
						<option value="0">--select--</option>
						<c:forEach items="${typeList }" var="type">
							<option value="${type.typeId }">${type.typeName }
						</c:forEach>
					</select>
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
		function department() {
			var dept = $("#deptId").val();
			alert(dept);

			$.ajax({
				type : "GET",
				url : "./getdepartmentId",
				data : "deptCourse=" + dept,

				success : function(response) {
					alert(response);
					$("#courseData").html(response)
					
				}

			});
		}
	</script>
	<script type="text/javascript">

function addhar_number(){
	  var number=$("#addharId").val();
      
	  	$.ajax({
			type : "GET",
			url : "./getAddharValidate",
			data : "addharno=" + number,
			
			success : function(response) {
				$("#addharNo").html(response)
			}

		}); 
}
</script>

<!-- <script type="text/javascript">
	$(function() {
		$('.datepicker').datepicker({
			format : 'dd-mm-yyyy'
		});

	});
</script> -->

<script type="text/javascript">
function valiadate(){
  let addhar=document.getElementById("addharId").value;
  let regexp = /^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$/ ;
  if(addhar==""){
	  
     alert("please filup this addhar ");
     return false;
	  }
  else if(regexp.test(addhar) === false){
	  alert("please give proper addharnumber ");
    return false;
	  }
 
  
   return true;
	
}

</script>
</body>
</html>