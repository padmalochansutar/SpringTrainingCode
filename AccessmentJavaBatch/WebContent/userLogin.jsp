<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./login">
         <div>
         <label>Enter user id:</label>
         
         <input type="text" name="userId">
         </div>
		      <div>
				<label>Enter password:</label>
			<input type="password" name="pwd">
            </div>

			<div>

				<input type="submit" value="login">
				<input type="reset" value="reset">
				</div>
				<br>
		<a href="registation.jsp">NEW USER LOGIN</a>
		</br>


		</form>
		

</body>
</html>