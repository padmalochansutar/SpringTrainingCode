<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./user" method="post">
	<div>
	<label>Enter User Id</label>
	<input type="text" name="userId">
	</div>
	
	<div>
	<label>Enter Password</label>
	<input type="password" name="pwd">
	</div>
	
	<div>
	<label>Enter User Name</label>
	<input type="text" name="userName">
	</div>
	
	<div>
	<label>Enter User Phone</label>
	<input type="number" name="number">
	</div>
	<div>
	<label>Enter user Address</label>
	<input type="text" name="Address">
	
	</div>
	<div>
	<label>Enter Email</label>
	<input type="text" name="email">
	</div>
	
	<div>
	<input type="submit" save="submit">
	</div>
</form>	
</body>
</html>