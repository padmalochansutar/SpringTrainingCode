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
     <div align="center" class="container">
<h3>Employee Info</h3>
		<table border="1" class ="table table-striped" id="empTableId">
			<thead>
				<tr>
					<th>Sl#</th>
					<th>EmpId</th>
					<th>Last Name</th>
					<th>Manager Name</th>
					<th>City</th>
					
					

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allempList }" var="emp" varStatus="counter">
					<tr>
						<td>${counter.count }</td>
						<td>${emp.empid }</td>
						<td>${emp.lastName }</td>
						<c:if test="${emp.manager ne null}"><td>${emp.manager.lastName }</td></c:if>
						<c:if test="${emp.manager eq null}"><td>No Manager</td></c:if>
						<td>${emp.department.locations.city }</td>
						
					</tr>

				</c:forEach>
			</tbody>
		</table>
		</div>
</body>
<script type="text/javascript">
$(document).ready(function (){
	$('#empTableId').DataTable();
});

</script>
</html>