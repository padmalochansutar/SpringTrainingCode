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
</head>
<body>
     <div class="container mt-5 text-danger">
		<div class="display-4">User Registration Form</div>
		<form action="./saveData" class="form-group"
			onsubmit="return validation()">
			
			<div class="row">
				<div class="col-sm-4">
					<label class="text-primary" >User Name</label> <input type="text"
						name="userName" id="nameId" class="form-control" >
				</div>
				<div class="col-sm-4">
					<label class="text-primary">MemberShipType:</label> 
					<select name="type">
				<option value="0">-select-</option>
				<c:forEach items="${memberList }" var="member" >
					<option value="${member.type }">${member.type }</option>
				</c:forEach>
			</select>
					
				</div>
				<div class="row">
				<div class="col-sm-4">
					<label class="text-primary" >mobile No:</label> <input type="text"
						name="mobileno"  class="form-control" >
				</div>
				<div class="col-sm-4">
					<label class="text-primary" >Fathers Name:</label> <input type="text"
						name="fathersname"  class="form-control" >
				</div>
				<div class="col-sm-4">
					<label class="text-primary" >Complete Address:</label> <input type="text"
						name="address"  class="form-control" >
				</div>
				<div class="col-sm-4">
					<label class="text-primary" >Gender:</label> 
					<label>GENDER:</label>
      
       <input type="radio"  name="gender" value="male" class="text-primary" > MALE
       
       <input type="radio"   name="gender" value="female" class="text-primary" >FEMALE
      
				</div>
				<div class="col-sm-4">
					<label class="text-primary" >Age:</label> <input type="text"
						name="age"  class="form-control" >
				</div>
			</div>
			
				<div class="col-sm-2 mt-3">
					<input type="submit" value="save" class="btn btn-success mt3 form-control">
				</div>
			</div>
		</form>
     
     <script type="text/javascript">
      function userValidate(){
       var name=document.getElementById("nameId").value;
       if(name>8){
           alert("please provide ")
           }
    
          }
      





     </script>
</body>
</html>