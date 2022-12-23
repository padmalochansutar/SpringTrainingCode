<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form align="center" action="./process" onsubmit="validation()">
		<h2>Order Details During Date Internal</h2>
		<div>
			<label>Date Between</label> <input type="date" name="ftdate" id="stdate">
			<label> and</label> <input type="date" name="ltdate" id="endate">
		</div>
		<div>
			<input type="submit" value="Fetch Orders">
		</div>
		<h2>Fetch Order</h2>
		<table border="1" align="center">
			<thead>
				<tr>
					<th>SL#</th>
					<th>Product Name</th>
					<th>Order Date</th>
					<th>Order Qty</th>
					<th>Order Value(Rupees)</th>
				</tr>
			</thead>
			<tbody>
				<%-- <c:forEach items="${storeDat}"  var="store"  varStatus="count"> --%>
			     <c:forEach items="${DataFetching }" var="fatch" varStatus="count">
					<tr>
						<td>${count.count }</td>
						<td>${store.prodName }</td>
						<td>${store.orderDate }</td>
						<td>${store.orderQty }</td>
						<td>${store.orderValue }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</form>
</body>
<script type="text/javascript">
	function validation() {
		sdate = document.getElementById('stdate').value;
		edate = document.getElementById('endate').value;
		sdate = new Date(sdate);
		edate = new Date(edate);

		if (edate < sdate) {
			alert("Invalid date range");
			return false;
		}
	}
</script>
</html>