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

</head>

<body>

	${quqntity } ${dataAll }

	<div class="container border color bg-info ">
		<div class="height:10%">
			<p align="right">
				<span class="text-danger">*</span> indicates mandatory fields
			</p>
			<h2 align="center">GARAGE FORM</h2>

		</div>
		<form action="./saveData" method="POST">
			<div class="row mt-5">
				<div class="col-sm-3">
					<label class="text-secondary text-warning">Garage Name:</label><br>
					<select name="garageId" id="garageId" onchange="return garage()">
						<option value="0">-select-</option>
						<c:forEach items="${findAll }" var="garage">
							<option value="${garage.garageId }">${garage.garageName }</option>
						</c:forEach>
					</select>
				</div>

				<div class="col-sm-3">
					<label class="text-secondary text-warning"> Type:</label><br>
					<select name="typeId">
						<option value="0">-select-</option>
						<c:forEach items="${typeList }" var="type">
							<option value="${type.typeId }">${type.typeName }</option>
						</c:forEach>
					</select>
				</div>

				<div class="col-sm-3">
					<label class="text-secondary text-warning">Quantity:</label><br>
					<input type="text" name="salesQuantity" class="form-control">
				</div>
				<div class="col-sm-3" id="tableDiv">
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
		function garage() {
			var garage = $("#garageId").val();
			alert(garage);

			$.ajax({
				type : "GET",
				url : "./getgarageId",
				data : "garageType=" + garage,

				success : function(response) {
					alert(response);
					$("#tableDiv").html(response)
				}

			});
		}
	</script>
</body>
</html>