<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>

</head>
<body>
	<div class="container border" class="form-group">

		<form action="./save" >

			<div>
				<input type="hidden" name="regid" value="${st.regid}"> <label>Select
					Region name</label> <select class="form-control" name="id" id="intRegionId">
					<!-- <option value="Select">Select</option> -->
					<c:forEach items="${listregion}" var="reg">
						<option value="${reg.id}">${reg.name}</option>

					</c:forEach>
				</select>
			</div>

			<div>
				<label>Processing Faculty name</label> <input type="text"
					class="form-control" name="facultyname" value="${st.facultyname}"
					id="facultyname" onkeypress="return blockSpecialAlphabet(event)"
					onchange="validateName()">
			</div>


			<div>
				<label>Faculty address</label> <input type="text"
					id="facultyaddress" class="form-control" name="facultyaddress"
					value="${st.facultyaddress}"
					onkeypress="return blockSpecialAlphabet(event)">
			</div>


			<div>
				<label>Status</label> <input type="radio" id="html" name="status"
					value="active" checked> <label>Active</label> <input
					type="radio" id="html" name="status" value="inactive"> <label>InActive</label><br>
			</div>
			<!-- <button class="btn btn-warning" onclick="addTemp()">Add</button> -->


			<!-- <div>
<input type="submit" value="Add">
</div> -->
			
			<div>
				<c:if test="${st eq null }">
					<input type="submit" value="Add" onsubmit="return addbutton()">
				</c:if>
				<c:if test="${st ne null }">
					<input type="submit" value="Update" onsubmit="return addbutton()">
				</c:if>
			</div>
			<a href="./submit" class="btn btn-warning">Submit</a>
		</form>



	</div>


	<div class="table-container mt-4">
					<table class="table table-bordered" id="empTable">
						<thead>
							<tr>
								<th>S.No</th>
								<th>Regionname</th>
								<th>facultyname</th>
								<th>facultyaddress</th>
								<th>status</th>
								<th>id</th>
								
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listregi}" var="reg" varStatus="count">
								<tr>
									<td>${count.count}</td>
									<td>${reg.id}</td>
									<td>${reg.facultyname}</td>
									<td>${reg.facultyaddress}</td>
									
									<td>${reg.status}</td>
									
									<td>${reg.id}</td>
									
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>


	<script type="text/javascript">
		$
				.ajax({
					type : "GET",
					url : "checkduplicateForFacByRegionId",
					data : dataString,
					cache : false,
					success : function(data) {
						if (data != '0') {
							swal("Facility name already exist");
							$("#ddlfacilityId").focus();
							$("#textboxgrp").val('');

							return false;
						} else {

							maxNumber++;
							//for value pass
							var regionNames = $("#intRegionId").val();

							var regionId = $("#intRegionId").val();

							var regionName = $("#intRegionId option:selected")
									.html();

							var FacilityName = $("#ddlfacilityId").val();
							var FacilityAddress = $("#ddlfacilityAddId").val();
							//for showing in add more	
							for (var i = 0; i < addfac.length; i++) {
								var facilityAddr = addfac[i].FacilityAddress;
								if (facilityAddr == FacilityAddress) {
									swal('Facility name should Not be duplicate !!');
									return false;
								}
							}
							var regionNamed = $("#intRegionId option:selected")
									.html();
							var FacilityNamed = $("#ddlfacilityId").val();
							var FacilityAddressd = $("#ddlfacilityAddId").val();

							var rowCount = $('#textboxgrp tr').length;

							if (rowCount == 0) {
								$("#textboxgrp")
										.append(
												'<thead><tr><th>SL</th><th>Region Name</th><th>Facility Name</th><th>Facility Address</th><th>Delete</th></thead>');
							}

							$("#textboxgrp")
									.append(
											'<tr id="slno_'+maxNumber+'"><td>'
													+ maxNumber
													+ '</td> <td>'
													+ regionNamed
													+ '</td><td>'
													+ FacilityNamed
													+ '</td><td id="ward_'+maxNumber+'">'
													+ FacilityAddressd
													+ '</td><td><a onclick="deleteAddMoreRow(this,'
													+ maxNumber
													+ ');" href="javascript:void(0);"><img alt="" src="images/delete_btn.gif"/></a></td></tr>');
							addfac.push({
								"regionName" : regionName,
								"intRegionId" : regionId,
								"FacilityName" : FacilityName,
								"FacilityAddress" : FacilityAddress,

								"ddlMaxNo" : maxNumber
							});//append method end

							var text = '{"FacilityAddressd":'
									+ JSON.stringify(addfac) + '}';
							$("#grpWardId").val(text);
							updateIndex();
						}//else end
					},//success end
					error : function(e) {
						console.log("Error :", e);
					},
					done : function(e) {
						console.log("DONE");
					}
				});
	</script>
	<script type="text/javascript">
		function blockSpecialAlphabet(e) {

			var regex = new RegExp("^[A-Za-z,\\s]+$");
			var str = String.fromCharCode(!e.charCode ? e.which : e.charCode);
			if (regex.test(str)) {
				return true;
			}
			return false;
		}
	</script>

	<script type="text/javascript">
		function addbutton()

		{
			let facultyname = document.getElementById("facultyname");
			let facultyaddress = document.getElementById("facultyaddress").value;

			if (facultyname.value == "") {
				alert("provide facultyid");
				return false;
			}
			if (facultyaddress.value == "") {
				alert("Provide Address");
				return false;
			}

			return true;
		}
		function validateName() {
			var facultyname = $("#facultyname").val();
			$.ajax({
				type : "GET",
				url : "./validateName",
				data : "facultyname=" + facultyname,
				success : function(response) {
					if (response == 1) {
						alert("This name already exist");
					}

				}

			});
		}
		function validateAddress() {
			var facultyaddress = $("#facultyaddress").val();
			$.ajax({
				type : "GET",
				url : "./validateAddress",
				data : "facultyaddress=" + facultyaddress,
				success : function(response) {
					if (response == 1) {
						alert("This Address already exist");
					}

				}

			});
		}
		function addTemp() {
			alert("fcg")
		}
	</script>



</body>
</html>