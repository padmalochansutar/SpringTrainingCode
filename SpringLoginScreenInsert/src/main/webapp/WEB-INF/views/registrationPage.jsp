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
	src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js"></script>
</head>
<h2>SUCESSFULL LOGIN</h2>
<body>
     
       <form action="./saveData">
      <input type="hidden" name="userId" id="userId" value="${upd.userId }">
       <div>
       <label>USER NAME:</label>
       <input type="text" name="name" value="${upd.name }">
       </div>
       
       <div>
       <label>GENDER:</label>
      
       <input type="radio"  name="gender" value="male" <c:if test='${upd.gender.equals("male") }'>checked="checked"</c:if>value="${upd.gender }"> MALE
       
       <input type="radio"   name="gender" value="female" <c:if test='${upd.gender.equals("female") }'>checked="checked"</c:if>value="${upd.gender }">FEMALE
      
       </div>
       <div>
       <label>COURSE:</label>
       <select name="branch">
       <option value="0">-select-</option>
       <option value="C"<c:if test='${upd.branch.equals("C") }'>selected="selected"</c:if>>C</option>
       <option value="C++"<c:if test='${upd.branch.equals("C++") }'>selected="selected"</c:if>>C++</option>
       <option value="JAVA"<c:if test='${upd.branch.equals("JAVA") }'>selected="selected"</c:if>>JAVA</option>
       <option value="PHP"<c:if test='${upd.branch.equals("PHP") }'>selected="selected"</c:if>>PHP</option>
       </select>
        </div>
        
       <div>
       <label>PASSWORD:</label>
       <input type="password" name="pwd" value="${upd.password }">
       </div>
       
       <div>
       
       <input type="submit" <c:choose><c:when test="${upd eq null }">value="save"</c:when><c:otherwise>value="update"</c:otherwise></c:choose> >
       </div>
       </form>
       
       <table border="1">
		<thead>
			<tr>
				<th>SLNO#</th>
				<th>USERNAME</th>
				<th>GENDER</th>
				<th>BRANCH</th>
				<th>ACTION</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${userList }" var="user" varStatus="count">
				<tr>
					<td>${count.count }</td>
					<td>${user.name }</td>
					<td>${user.gender }</td>
					<td>${user.branch }</td>
					<td><a href="./updateUser?userId=${user.userId }" class="btn btn-success">UPDATE</a>&nbsp;&nbsp;<a href="./deleteUser?userId=${user.userId }" class="btn btn-danger">DELETE</a>
					
				</tr>
			</c:forEach>
		
		</tbody>
	</table>
      
       
       
</body>
</html>