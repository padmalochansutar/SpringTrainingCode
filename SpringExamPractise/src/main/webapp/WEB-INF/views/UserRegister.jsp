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
<body>

	<section class="vh-100 gradient-custom">
		<div class="text-warning">
			<div class="container py-5 h-100 text-success">
				<div class="row justify-content-center align-items-center h-100">
					<div class="col-12 col-lg-9 col-xl-7">
						<div class="card shadow-2-strong card-registration"
							style="border-radius: 15px;">
							<div class="card-body p-4 p-md-5">
						<p class="text-danger">	${data }</p>
								<h3 class="mb-4 pb-2 pb-md-0 mb-md-5">USER REGISTATION FORM</h3>
								
								<form class="text-danger" action="./register" onsubmit="return validateForm()">

									<div class="row">
										<div class="col-md-6 mb-4">

											<div class="form-outline">
												<input type="text" name="fname" id="firstName"
													class="form-control form-control-lg" /> <label
													class="form-label" for="firstName">First Name</label>
											</div>

										</div>
										<div class="col-md-6 mb-4">

											<div class="form-outline">
												<input type="text" name="lname" id="lastName"
													class="form-control form-control-lg" /> <label
													class="form-label" for="lastName">Last Name</label>
											</div>

										</div>
									</div>

									<div class="row">
										<div class="col-md-6 mb-4 d-flex align-items-center">

											<div class="form-outline datepicker w-100">
												<input type="text" name="faname"
													class="form-control form-control-lg" id="fanameId" />
												<label for="birthdayDate" class="form-label">Father
													Name</label>
											</div>

										</div>
										<div class="col-md-6 mb-4">

											<h6 class="mb-2 pb-1">Gender:</h6>

											<div class="form-check form-check-inline">
												<input class="form-check-input" type="radio" name="gender"
													id="genderId1" value="female"  /> <label
													class="form-check-label" for="femaleGender">Female</label>
											</div>

											<div class="form-check form-check-inline">
												<input class="form-check-input" type="radio" name="gender"
													id="genderId2" value="male" /> <label
													class="form-check-label" for="maleGender">Male</label>
											</div>

											<div class="form-check form-check-inline">
												<input class="form-check-input" type="radio" name="gender"
													id="genderId3" value="other" /> <label
													class="form-check-label" for="otherGender">Other</label>
											</div>

										</div>
									</div>

									<div class="row">
										<div class="col-md-6 mb-4 pb-2">

											<div class="form-outline">
												<input type="email" name="email" id="emailId"
													class="form-control form-control-lg" /> <label
													class="form-label" for="emailAddress">Email</label>
											</div>

										</div>
										<div class="col-md-6 mb-4 pb-2">

											<div class="form-outline">
												<input type="tel" name="number" id="phoneNumber"
													class="form-control form-control-lg" /> <label
													class="form-label" for="phoneNumber">Phone Number</label>
											</div>

										</div>


									</div>
									<div class="row">
										<div class="col-md-6 mb-4">

											<div class="form-outline">
												<input type="text" name="address" id="address"
													class="form-control form-control-lg" /> <label
													class="form-label" for="firstName">Address</label>
											</div>

										</div>
										<div class="col-md-6 mb-4">

											<div class="form-outline">
												<input type="text" name="pincode" id="pincode"
													class="form-control form-control-lg" /> <label
													class="form-label" for="lastName">pincode</label>
											</div>

										</div>
										<div class="col-md-6 mb-4">

											<div class="form-outline">
												<input type="date" name="date" id="dateId"
													class="form-control form-control-lg" /> <label
													class="form-label" for="lastName">Date</label>
											</div>

										</div>
										
									</div>



									<div class="form-check">
										<input class="form-check-input" type="checkbox" name="quals" value="10th"
											id="flexCheckDefault"> <label
											class="form-check-label" for="flexCheckDefault">
											10th </label>&nbsp &nbsp &nbsp<input class="form-check-input" type="checkbox" value="+2"
											name="quals" id="flexCheckChecked" > <label
											class="form-check-label" for="flexCheckChecked">
											+2</label>&nbsp &nbsp &nbsp<input class="form-check-input" type="checkbox" name="quals" value="+3"
											id="flexCheckChecked" > <label
											class="form-check-label" for="flexCheckChecked">
											+3</label>
									</div>
									<input type="submit"  value="save" class="btn btn-primary btn-lg">&nbsp &nbsp<input type="submit"  value="reset" class="btn btn-warning btn-lg">
									</form>
							</div>




						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
	</section>

<script type="text/javascript">
function validateForm(){
	let n = document.getElementById("firstName").value;
	let letters = /[^A-Za-z]+$/;
	let upper = /^[A-Z]/;
	
    let num=document.getElementById("phoneNumber").value;
    let pin=document.getElementById("pincode").value;
    let email=document.getElementById("emailId").value;
    console.log(email);
    let validRegex = /^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/;
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
    if (num==""){
		alert("mobileNumber not blank");
		return false;
	}
	   
    else  if ( num.length != 10) {
		  alert("give 10 digit number only");
		  return false;
		  }
   if(pin==""){
       alert("pincode Not blank");
       return false;
       }
   else if(pin.length!=6){
      alert("give 6 digit pincode number");
      return false;
       }
   if(email==""){
	   alert("mailId not blank");
	   return false
       }
   else if(validRegex.test(email)){
    
      return true;
	   }
	return true;
}









</script>>

</body>
</html>