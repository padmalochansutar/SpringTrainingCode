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
   <h1>Spring Boot File Download </h1>
   
   <div>
   <div>
   <h3><a href="@{/download_file}">Download a File from server</a></h3>
    </div>
     <div>
   <h3><a href="@{/download_document}">Download a document from databse</a></h3>
    </div>
     <div>
   <h3><a href="@{/download_csv}">Download a generated csv file</a></h3>
    </div>
   </div>
</body>
</html>