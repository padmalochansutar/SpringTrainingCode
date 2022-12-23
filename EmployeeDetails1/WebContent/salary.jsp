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
    <form action="./front">
    <div>
    <label>Employee Name</label>
    <select option="empId">
    <option value="0">-select-</option>
    <c:forEach items="${empList }" var="emp">
    <option value="${emp.empId }">${emp.empName }</option>
    </c:forEach>
    </select>
    </div>
     <div>
    <label>Month</label>
    <select option="month">
    <option optio="0">-select-</option>
    <c:forEach items="${monthList }" var="mon">
    <option value="${mon }">${mon }</option>
    </c:forEach>
    </div>
    
     <div>
    <label>Year</label>
    <input type="text" name="year">
    </div>
     <div>
    <label>Bonus</label>
    <input type="text" name="bonus">
    </div>
     <div>
    <label>Deduction</label>
    <input type="text" name="deduction">
    </div>
     <div>
    
    <input type="submit" value="submit">
     <input type="reset" value="reset">
    </div>
    
    
    </form>
</body>
</html>