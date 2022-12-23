<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./save" method="POST" enctype="multipart/form-data">
UserName:<input type="text" name="name" id="nameId" ><br/>
UserEmail:<input type="text" name="emailId" id="emailId"><br/>
MobileNo:<input type="text" name="number" id="number"><br/>
Password:<input type="password" name="password" id="password"><br/>
File:<input type="file" name="pic" id="picId"><br/>
<input type="submit" value="save">

</form>

</body>
</html>