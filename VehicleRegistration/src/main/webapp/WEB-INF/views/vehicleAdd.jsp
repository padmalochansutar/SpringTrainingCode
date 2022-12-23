<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>

<body>
	<form  method="post" action="vehicleSaveData" enctype="multipart/form-data">
		<div>
			<label>VEHICLE REG NO:</label> <input type="text" name="regno">
		</div>
		<div>
			<label>VEHICLE STATE:</label> <select name="state">
				<option>--select--</option>
				<option>ODISHA</option>
				<option>ANDHRAPRADESH</option>
				<option>BIHAR</option>
				<option>ASAM</option>
				<option>GUJURAT</option>
			</select>
		</div>

		<div>
			<label>Extra IMG#1:</label> <input type="file" name="img">
		</div>

        <div>
     <label>Extra IMG#2:</label>
     <input type="File" name="eimage2"  >
    </div>

		<div>
			<label>PERMIT VALIDITY:</label> <input type="date" name="pdate">
		</div>
		<div>
			<label>FITNESS VALIDITY:</label> <input type="date" name="fdate">
		</div>

		<div>
			<label>ROADTAX VALIDITY:</label> <input type="date" name="rdate">
		</div>


		<div>
		<input type="submit" value="submit">&nbsp;&nbsp;<input
			type="reset" value="cancel">
		</div>
	</form>

</body>
</html>