<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
     
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
<div class="display-4">EMPLOYEE DATE</div><hr style="width:50%;text-align:left;margin-left:0">
      <form action="./te">
      <div class="row">
      <div class="col-sm-4">
      <label>From Date:</label>
      <input type="date" name="date1" >
      </div>
      
      <div class="col-sm-4">
      <label>To Date:</label>
      <input type="date" name="date2" >
      </div>
      </div>
      <div class="row">
      <div class="col-sm-2 mt-3">
      <input type="submit" value="submit"  class="btn btn-success mt3 form-control">
      </div>
      </div>
     </form>
          <table border="1" class ="table table-striped" id="dateTableId">
          <thead>
          <tr>
          <th>SLNO#</th>
          <th>EmpId</th>
          <th>LastName</th>
          <th>Date</th>
          <th>Depart Name</th>
          <th>City</th>
          </tr>
           </thead>
          <tbody>
          <c:forEach items="${dateList }" var="date" varStatus="count">
				<tr>
					<td>${count.count }</td>
					<td>${date.employeeId }</td>
					<td>${date.lastName }</td>
					<td><fmt:formatDate pattern = "dd-MM-yyyy" 
         value = "${date.hireDate }" /></td>
                    <td>${date.department.departmentName }</td>
                    <td>${date.department.locations.city }</td>
					
				</tr>
			</c:forEach>
          
          </tbody>
          </table>
          </div>
	
	
</body>

</body>
<script type="text/javascript">
$(document).ready(function (){
	$('#dateTableId').DataTable();
});

function dateWorking(){
	
}

var da="click on ok then go to my page";
alert(da);
</script>

</html>