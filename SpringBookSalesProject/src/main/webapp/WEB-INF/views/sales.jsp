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
	<p>${msg }</p>
	<form action="./saveData">

		<div class="form-group text-danger ">
			 <label>Library Type:</label><br> <select
				name="idlibraryid">
				<option value="0">-select-</option>
				<c:forEach items="${libraryList }" var="library">
					<option value="${library.idlibraryid }">${library.name }</option>
				</c:forEach>
			</select>
		</div>

		<div class="form-group text-danger ">
			<label>Book Type:</label><br> <select name="bookid">
				<option value="0">-select-</option>
				<c:forEach items="${bookList }" var="book">
					<option value="${book.bookid }">${book.name }</option>
				</c:forEach>
			</select>
		</div>

		<div class="form-group text-danger ">
			<label>Quantity:</label><br> <input type="text" name="quantity"
				class="form-control">
		</div>
		<br>
		<div class="form-group text-danger">
			<input type="submit" value="Submit" class="btn-success">&nbsp;&nbsp;<input
				type="reset" value="Reset" class="btn-danger">
		</div>
		      
			 <table border="1">
                  <h1>Purchase of ${nameList }</h1>
						<tr>
							<th>BookName</th>
							<th>Quantity</th>
						</tr>
                        <tbody>
                        <c:forEach items="${bookL }" var="book">
                           <tr>
                           
                           
					<td>${book.name }</td>
					<td>${book.quantity }</td>
				
                           
                           </tr>
                           </c:forEach>
                        
                        </tbody>
					</table>


				
			
			
		
	</form>



</body>
</html>