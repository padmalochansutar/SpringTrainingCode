<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
<link
	rel="https://cdnjs.datatables/1.12.1/css/dataTables.bootstrap4.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js"></script>
	
	<!-- soumya link used foe tab bar below two link -->
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
</head>
<body>
${regi }
<form action="./searchData">
    <div class="col-sm-3">
					<label class="text-secondary text-warning"> College Name:</label><br>
					<select name="courseData" id="courseData" onchange="return collegeData()">
						<option value="0">--select--</option>
						<c:forEach items="${collegeList }" var="type">
							<option value="${type.collegeId}">${type.collegeName }</option>
						</c:forEach>
					</select>
					<input type="submit" value="search">
				</div>

<br><br>

<div  class="container mt-5 text-danger">
		<div class="display-4">Registation Details</div>
		<hr>
		<table border="1" class ="table table-striped" id="dateTableId">
			<thead>
				<tr>
					<th>SL#</th>
					<th>Name</th>
					<th>Email</th>
					<th>MobileNo</th>
					<th>Image</th>
					<th>CollegeName</th>
					<th>Branch</th>
					<th>Fees</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${rList }" var="reg" varStatus="count">
					<tr>
						<td>${count.count }</td>
						<td>${reg.applicantName }</td>
						<td>${reg.emailId }</td>
						<td>${reg.mobileNo }</td>
						<td>${reg.image }</td>
						<td>${reg.college.collegeName }</td>
						<td>${reg.branch.branchName }</td>
						<td>${reg.branch.fees }</td>
						

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


</form>

	

<script type="text/javascript">
$(document).ready(function (){
	$('#dateTableId').DataTable();
});
</script>
</body>
</html>