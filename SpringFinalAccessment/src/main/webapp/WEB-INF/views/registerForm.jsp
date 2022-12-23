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
	src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js"></script>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	
</head>
<body>
	<div class="container mt-5 text-danger p-3 mb-2 bg-warning text-white">
		<div class="display-4 text-center">User Registration Form</div>
		<br>
		<form action="./saveData" method="post" class="form-group"
			onsubmit="return validation()">
         <div ><p class="text-danger" id="mobileno1"></p></div>
			<div class="row">
				<div class="col-sm-4">
					<label class="text-primary">User Name</label> <input type="text"
						name="username" id="nameId" class="form-control">
				</div>
				<div class="col-sm-4">
					<label class="text-primary">MemberShipType:</label> <select
						name="member">
						<option value="0">-select-</option>
						<c:forEach items="${memberList }" var="member">
							<option value="${member.mid }">${member.name }</option>

						</c:forEach>
					</select>

				</div>
				<div class="row">
					<div class="col-sm-4">
						<label class="text-primary">mobile No:</label> <input type="text"
							name="mobileno"  onchange="mobile_number()" id="mobileno" class="form-control" >
					</div>
					<div class="col-sm-4">
						<label class="text-primary">Fathers Name:</label> <input
							type="text" name="fatherName" class="form-control">
					</div>
					<div class="col-sm-4">
						<label class="text-primary">Complete Address:</label>
						<textarea name="caddress" class="form-control"></textarea>
					</div>
					<div class="col-sm-4">

						<label class="text-primary">GENDER:</label> <input type="radio"
							name="gender" value="male" class="text-primary"> MALE <input
							type="radio" name="gender" value="female" class="text-primary">FEMALE

					</div>
					<div class="col-sm-4">
						<label class="text-primary">Age:</label> <input type="text"
							name="age" class="form-control">
					</div>
				</div>

				<div class="col-sm-2 mt-3 ">
					<input type="submit" value="save"
						class="btn btn-success mt3 form-control ">
				</div>
			</div>
		</form>
		</div>
		<table border="1">
			<thead>
				<tr>
					<th>SLNO#</th>
					<th>USERNAME</th>
					<th>MOBILENO</th>
					<th>FATHERNAME</th>
					<th>CURRENT ADDRESS</th>
					
					<th>AGE</th>
					<th>GENDER</th>
					<th>MEMBERSHIP TYPE</th>
					 <th>FESS</th> 
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userList }" var="user" varStatus="count">
					<tr>
						<td>${count.count }</td>
						<td>${user.username }</td>
						<td>${user.mobileno }</td>
						<td>${user.fatherName }</td>
						<td>${user.caddress }</td>
					
						<td>${user.age }</td>
						<td>${user.gender }</td>
						<c:forEach items="${user.member}" var="um">
						  <td>${um.name}</td>
						 <td>${um.fees}</td> 
 					</c:forEach>				
						
					</tr>
				</c:forEach>
           </tbody>
       </table>
       
      
</body>
 <script type="text/javascript">
      function mobile_number(){
      var number=$("#mobileno").val();
      
  	$.ajax({
		type : "GET",
		url : "./getMobileValidate",
		data : "mobileno=" + number,
		
		success : function(response) {
			$("#mobileno1").html(response)
		}

	});
  

          }
 
       </script>
</html>