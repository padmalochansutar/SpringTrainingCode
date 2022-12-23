<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registation Form</title>
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
<body>
	<div class="container">
		<br>
		<h1 class="text-success text-center">REGISTATION FORM</h1>
		<div class="col-lg-4 m-auto- d-blcock">
			<form action="./saveData" onsubmit="return valiatedForm()">
				${districtId }

				<div class="form-group text-danger">
					<label>APPLICANT NAME:</label> <input type="text" name="name"
						id="nameId" class="form-control" autocomplete="off"> <span
						id="name" class="text-danger font-weight-bold"></span>
				</div>


				<div class="form-group text-danger">
					<label>MOBILE NO:</label> <input type="text" name="mobileno"
						id="mobileId" class="form-control" autocomplete="off">
				</div>


				<div class="form-group text-danger">
					<label>PASSWORD :</label> <input type="password" name="password"
						id="pwd" class="form-control" autocomplete="off">
				</div>


				<div class="form-group text-danger">
					<label>STATE:</label> <select name="state">
						<option value="0">-select-</option>
						<c:forEach items="${stateList }" var="state">
							<option value="${state.name }">${state.name }</option>
						</c:forEach>
					</select>
				</div>



				<div class="form-group text-danger">
					<label>DISTRICTS:</label> <select name="districts">
						<option value="0">-select-</option>
						<c:forEach items="${districtList }" var="dist">

							<option value="${dist.name }">${dist.name }</option>

						</c:forEach>
					</select>
				</div>


				<div class="form-group text-danger">
					<label>ADDRESS:</label> <input type="text" name="address"
						id="addressId" class="form-control" autocomplete="off">
				</div>


				<div class="form-group text-danger">
					<label>PINCODE:</label> <input type="text" name="pincode"
						id="pincode" class="form-control" autocomplete="off">
				</div>

				<div class="form-group text-danger">
					<input type="submit" value="Register" class="btn-success">&nbsp;&nbsp;<input
						type="reset" value="Reset" class="btn-danger">
				</div>

			</form>
		</div>
	</div>




</body>

<script type="text/javascript">
	function valiatedForm() {

		let n = document.getElementById("nameId").value;
		let letters = /[^A-Za-z]+$/;
		let upper = /^[A-Z]/;
		
        let num=document.getElementById("mobileId").value;
        var filter = /^((\+[1-9]{1,4}[ \-]*)|(\([0-9]{2,3}\)[ \-]*)|([0-9]{2,4})[ \-]*)*?[0-9]{3,4}?[ \-]*[0-9]{3,4}?$/;

       
        /* let mobileno = /^((\\+91-?)|0)?[0-9]{10}$/; */
        let pin=document.getElementById("pincode").value;
        
        if (letters.test(n)) {
			alert("Give Only Alphabet");
			return false;
		} 
		else if (n == "") {
			alert("Not Balank name");
			return false;
		} 
        if (n[0].toUpperCase() != n[0]) {
			//alert("sucessful name");
			 alert("Give the first character capital");
			return false;
		}
       
         /*  else {
            alert('Not a valid number');
            var validate = false;
          } */
       if (num==""){
			alert("mobileNumber not blank");
			return false;
		}
       else if (filter.test(num)) {
           if(num.length==10){
                var validate = true;
           } else {
               alert('Please put 10  digit mobile number');
               var validate = false;
               return false
           }
           
         }
       /*  else if(num.value.match(mobileno) === false ) {
           alert("give 10 digit number");
           return false;
            } */
		   
       /*  else  if ( num.length > 10) {
			  alert("give 10 digit number only");
			  return false;
			  }  */
			   if(pin==""){
           alert("pincode Not blank");
           return false;
           }
       else if(pin.length!=6){
          alert("give 6 digit pincode number");
          return false;
           }
       
		return true;
	}
</script>

</html>