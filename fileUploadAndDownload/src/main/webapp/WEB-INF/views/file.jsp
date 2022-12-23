<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPLOAD FILE AND DOWNLOAD FILE</title>
</head>
<body>
<h1>${msg }</h1>
<form action="./save" method="POST" enctype="multipart/form-data">
Upload File:<input type="file" name="file" id="file"><br/>
<input type="submit" value="save">
</form>
</body>
</html>