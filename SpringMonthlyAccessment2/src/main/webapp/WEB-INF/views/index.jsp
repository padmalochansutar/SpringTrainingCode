<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="https://cdnjs.datatables/1.12.1/css/dataTables.bootstrap4.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>  
<script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js"></script>
<!-- ------------------------------------------------------------------------------------------- -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.css"
	rel="stylesheet">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>
</head>
<body style="background-color:plum;">
	
	<div class="container">
		
		<!-- <ul class="nav nav-tabs">
			<button value="add" class="btn-warning float-left mr-2">ADD</button>
			&nbsp;&nbsp;
			<button value="view" class="btn-danger float-left" ><a href="./allData"  data-bs-toggle="collapse">VIEW</a></button>

		</ul>
 -->
		<div class="tab-content">
			<div id="home" class="tab-pane fade in active">

				<div class="container">
				<p align="right">
				<span class="text-danger">*</span> indicates mandatory fields
				</p>
					<form action="./saveData" method="post" enctype="multipart/form-data" onsubmit="return FormValidation()">


						<h3 class="display-4 text-danger" align="center">Broadband Connection Form</h3>
						<div class="text-center">
							<c:if test="${not empty Msg}">
					  			 <span class="text-danger"  id="emsg"><strong>Error!</strong>${Msg}</span>
					 		</c:if>  
				 
				
</div>
						<div class="row">
							<div class="form-group col-md-4">
								<label>Service Provider Name :<span
						class="text-danger">*</span></label> <select
									onchange="service()" id="providerId" name="pName"
									class="form-control">
									<option value="0">-select-</option>
									<c:forEach items="${seviceList}" var="provider">
										<option value='${provider.providerId}'>${provider.providerName}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group col-md-4">
								<label>Connection Speed:<span
						class="text-danger">*</span></label> <input  disabled="disabled"
									type="text" name="cname" id="connectionId" 
									class="form-control">
							</div>
							<!-- <div class="form-group col-md-4">
								<label>Branch Name:<span
						class="text-danger">*</span></label> <select
									onchange="branch()" id="branchData" name="bName"
									class="form-control">
									<option value="0">-select-</option>

								</select>
							</div> -->
							
						</div>
						<div class="container"
							style="margin-top: 25px; border: 1px solid black;">
								<h4 align="left">Applicant Details</h4>
							<div class="row">
								<div class="form-group col-md-4">
									<label>Applicant Name :<span
						class="text-danger">*</span></label> <input type="text"
										name="applicantName" id="applicantName" class="form-control">
									<span id="applicantNameEr" class="text-danger font-weight-bold"></span>
								</div>
								<div class="form-group col-md-4">
									<label>Email :<span
						class="text-danger">*</span></label> <input type="text" name="email"
										id="email" class="form-control"> <span id="emailEr"
										class="text-danger font-weight-bold"></span>
								</div>
								<div class="form-group col-md-4">
									<label>Mobile No:<span
						class="text-danger">*</span></label> <input type="number" name="mobileNo"
										id="mobileNo" class="form-control"> <span
										id="mobileNoEr" class="text-danger font-weight-bold"></span>
								</div>
								
							</div>

							<div class="row">

								<div class="form-group col-md-4">
									<label>Date of Birth:<span
						class="text-danger">*</span></label> <input type="date" id="dob" name="dob"
										 class="form-control"> <span
										class="text-danger font-weight-bold"></span>
								</div>
								<div class="form-group col-md-4">
									<label>Gender :<span
						class="text-danger">*</span></label> <br> <input type="radio"
										name="gender" id="gentype" value="Female">Female <input
										type="radio" name="gender" id="gentype" value="Male"
										checked="checked">Male <span id="fatherNameEr"
										class="text-danger font-weight-bold"></span>
								</div>
					
								<div class="form-group col-md-4">
									<label>Upload Id Proof :<span
						class="text-danger">*</span></label> <input type="file"
										name="idProof" id="imageId" class="form-control">
								</div>
							</div>
							<div align="center">
								<input type="submit" value="Submit" class="btn btn-success">&nbsp;&nbsp;<input
									type="submit" value="Reset" class="btn btn-danger">
							</div>
						</div>

					</form>
					
					<h1 align="center" class="display-4 text-primary">Search Data</h1>
					<form action="./search">
						<div class="container"
							style="margin-top: 25px; border: 1px solid black;">
								<h4 align="left">Filter</h4>
						<div class="row">
							<div class="form-group col-md-4">
								<label>Service Provider Name :<span
						class="text-danger">*</span></label> <select
									 id="providerId" name="pName"
									class="form-control">
									<option value="0">-select-</option>
									<c:forEach items="${seviceList}" var="provider">
										<option value='${provider.providerId}'>${provider.providerName}</option>
									</c:forEach>
								</select>
								</div>
								<div class="form-group col-md-4"><br>
								<input type="submit" value="Search" class="btn btn-success">
							</div>
							
				</div>
				</div>
					</form>
					
					
					</div>

                 

				</div>
			</div>
			
					
				
</form>
<table class="table table-stripped" id="BookingTable" border="1">
				<thead>
					<tr>
						<th>Sl#</th>
						<th>Name</th>
						<th>Email</th>
						<th>Mobile No</th>
						<th>Document</th>
						<th>provider Name</th>
						<th>Speed</th>
						<th>Fees</th>
					</tr>
				</thead>
				<tbody>


					<c:forEach items="${allApplicantList}" var="aDetails"
						varStatus="count">
						<tr>
							<td>${count.count}</td>
							<td>${aDetails.name}</td>
							<td>${aDetails.mailId}</td>
							<td>${aDetails.mobileNumber}</td>

							<td>${aDetails.file}</td>
							
							<td>${aDetails.serviceProvider.providerName}</td>
							<td>${aDetails.connectionSpeed.connectionName}</td>
							<td>${aDetails.connectionSpeed.fees}</td>
                            
                           
						</tr>
					</c:forEach>

				</tbody>
			</table>

			
			
		
			</div> 
			
			</div>

		</div>
	
</body>


<script type="text/javascript">
function service() {
	var college = $("#providerId").val();
	alert(college);
	$.ajax({
		type : "GET",
		url : "./getByproviderId",
		data : "pId=" + college,
		success : function(response) {
			alert(response)
			$('#connectionId').val(response);
		}
	});

}
	/* function branch() {
		var branch = $("#branchData").val();
		alert(branch);
		$.ajax({
			type : "GET",
			url : "./getByBranchId",
			data : "bId=" + branch,
			success : function(response) {
				$('#feesId').val(response);
			}
		});

	}
 */
	function FormValidation() {

		var vcustomerName = document.getElementById("applicantName").value;
		var vemail = document.getElementById("email").value;
		var vmobileNo = document.getElementById("mobileNo").value;
		var vdob = document.getElementById("dob").value;


	    var applicantCheck = /^[A-Za-z. ]{3,}$/;
        var emailCheck = /^[A-Za-z]{1,}[0-9]{2,6}@[A-Za-z]{1,}[.]{1}[A-Za-z.]{2,6}$/ ;
        var mobileCheck = /^[6789][0-9]{9}$/ ;
        var dobCheck = /^\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$/

	    if(applicantCheck.test(vcustomerName)){
			document.getElementById("applicantNameEr").innerHTML = " ";
			}
		else{
			document.getElementById("applicantNameEr").innerHTML = " ** Applicant name must contains 3 character and only alphabets ";
			return false;
			} 
	    if(emailCheck.test(vemail)){
			document.getElementById("emailEr").innerHTML = " ";
			}
		else{
			document.getElementById("emailEr").innerHTML = " ** Please provide valid email ";
			return false;
			} 
	    if(mobileCheck.test(vmobileNo)){
			document.getElementById("mobileNoEr").innerHTML = " ";
			}
		else{
			document.getElementById("mobileNoEr").innerHTML = " ** Please provide valid mobileNo and ist should be indian standard ";
			return false;
			} 
	    
	    if(dobCheck.test(vdob)){
			document.getElementById("dobEr").innerHTML = " ";
			}
		else{
			document.getElementById("dobEr").innerHTML = " ** age must be greater than 18 ";
			return false;
			} 
	}

</script>


<script>
       $(document).ready(function () {
    $('#BookingTable').DataTable();
    $('#h3').select2();
});
       $('#dob').datepicker({
    		format : 'dd/mm/yyyy'
    	});
   </script>
</html>