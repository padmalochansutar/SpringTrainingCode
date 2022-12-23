<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>

<body>

   
    <div class="col-sm-4">
					<label class="text-primary">MemberShipType:</label> <select
						name="library" onchange="sales_book()" id="libraryId">
						<option value="0">-select-</option>
						<c:forEach items="${salesList }" var="sales">
							<option value="${sales.library.libraryid }">${sales.library.name }</option>

						</c:forEach>
					</select>

				</div>
				<div>
				<label>Library NAME:</label>
				 <select name="book" onchange="book_quantity()" id="salesId">
					<option value="0">-select-</option>
					<%-- <c:forEach items="${statesList }" var="states">
						<option value="${states.stateId }">${states.name }</option>
					</c:forEach> --%>
				</select>
			</div>
			<div>
				<label>Book Quantity:</label>
				
				<input disabled="disabled" class="from-control"  type="text" name="bookQuantity" id="bookQuantity" >
			</div>
			
    
</body>
<script type="text/javascript">
	function sales_book() {
		var library=$("#libraryId").val();
		alert(library);
		$.ajax({
			type : "GET",
			url : "./getSalesByLibraryId",
			data : "libraryId=" + library,
			
			success : function(response) {
				$("#salesId").html(response)
			}

		});
	}
	function book_quantity() {
		var bquantity=$("#salesId").val();
		alert(bquantity);
		$.ajax({
			type : "GET",
			url : "./getBookQuantity",
			data : "bquantity=" + bquantity,
			
			success : function(response) {
				$("#bookQuantity").val(response)
			}

		});
	}
	
	</script>
</html>