<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>Sales Form</h3>
		<Form action="./process" method="post">
			<div>
				<label>Customer</label> <select name="CustId">
					<option value="0">-select-</option>
					<c:forEach items="${custList }" var="cust">
    <option value="${cust.custId }">${cust.custName }</option>
    </c:forEach>
				</select>
			</div>
			<div>
				<label>Product</label> <select name="ProdId">
					<option value="0">-select-</option>
					<c:forEach items="${prodList }" var="prod">
    <option value="${prod.prodId }">${prod.prodName }</option>
    </c:forEach>
				</select>
			</div>
			<div>
				<label>Sales Qty</label> 
					<input type="text" name="salQty">
			</div>
			<div>
			<input type="submit" value="Submit">
			</div>
			
		</Form>
</body>
</html>