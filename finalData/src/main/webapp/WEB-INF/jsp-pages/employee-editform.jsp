<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>

<style>
label {
	width: 100px;
	display: inline-block;
}

button {
	margin: 20px;
	padding-right: 10px;
}

.form {
	margin: 30px;
	padding-right: 5px;
}
</style>

</head>
<body>
	<form action="editData" method="POST">
		<div>
			<h1>Edit Form</h1>
			<p> Edit your details to update the account.</p>

			<hr>
			<label for="firstname"><b>First Name</b></label> 
			<input type = "text" name = "emp_name" value=${command.emp_name}><br><br>
			
			 <label for = "emp_mobileNumber"><b>Mobile No</b></label> 
			 <input type = "text"  name = "emp_mobileNumber" value=${command.emp_mobileNumber} ><br><br>
			 
			 <label for = "emp_mailId"><b>Email</b></label> 
			 <input type = "text"  name = "emp_mailId" value=${command.emp_mailId}><br><br>
			 
			 <label for = "password"><b>Password</b></label> 
			 <input type = "password"  name = "password" value=${command.password}><br> <br> 
			 
			 <label for = "emp_DOB"><b>Enter DOB</b></label> 
			 <input type = "date" name = "emp_DOB" value=${command.emp_DOB}>
			 
			<p>
				<b>Select your gender:</b>
			</p>
			<input type = "radio" name = "emp_gender" value = "male"> Male<br>
			<input type = "radio" name = "emp_gender" value = "female"> Female<br><br>
			
			<label for = " emp_address"><b>Address</b></label> 
			<input type = "text" name = "emp_address" value=${command.emp_address}><br><br> 
			
			<label for = "emp_JDate"><b>Joining Date</b></label> 
			<input type = "date" name = "emp_JDate" value=${command.emp_JDate}><br><br> 
			
			<label for = "Department"><b>Department</b></label> 
			<select name = "emp_department">
				<option value = "Department">Select</option>
				<option value = "HR">HR</option>
				<option value = "Developer">Developer</option>
				<option value = "Testing">Testing</option>
				<option value = "Finance">Finance</option>
				<option value = "Others">Others</option>
			</select><br>
			<br>

			<div>
				<label for = "emp_salary"><b>Salary</b></label>
				 <input type = "text" name = "emp_salary" value=${command.emp_salary}><br><br>
				
			</div>
			<form:hidden path="emp_Id" />
			<!-- <input type = "submit" value="SAVE"/> -->
			<button>Save</button>
			<button>Cancel</button>
		
			<hr>
		</div>
	</form>

</body>
</html>