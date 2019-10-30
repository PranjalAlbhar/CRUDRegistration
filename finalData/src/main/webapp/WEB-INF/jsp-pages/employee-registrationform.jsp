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
	margin: 15px;
}

.form {
	margin: 40px;
}
</style>

</head>
<body>

	<form action="save" method="post">
		<div class="form">
			<h1>Register</h1>
			<p>Please fill in this form to create an account.</p>

			<hr>


			<label for="firstname"><b>First Name</b></label> <input type="text"
				placeholder="Enter the Name" name="emp_name" required><br>
			<br> 
			<label for="emp_mobileNumber"><b>Mobile No</b>
			</label> <input
				type="text" placeholder="Enter Mobile Number"
				name="emp_mobileNumber" required><br> <br> <label
				for="emp_mailId"><b>Email</b>
				</label> 
				<input type="text"
				placeholder="Enter Email" name="emp_mailId" required><br>
			<br> 
			<label for="password"><b>Password</b></label> <input
				type="password" placeholder="Enter Password" name="password"
				required><br> <br> 
				 <label for="emp_DOB"><b> Enter DOB</b></label> <input
				type="date"  name="emp_DOB"  required><br>
				

			<p>
				<b>Select your gender:</b>
			</p>
			<input type="radio" name="emp_gender" value="male"> Male<br>
			<input type="radio" name="emp_gender" value="female"> Female<br>
			<br> 
			<label for=" emp_address"><b>Address</b></label> <input
				type="text" placeholder="Enter the Address" name=" emp_address"
				required><br> <br>
				 <label for="emp_JDate"><b>Joining
					Date</b></label> <input type="date" 
				name="emp_JDate"  required><br>
			<br> 
			
			<label for="Department"><b>Department</b></label> <select
				name="emp_department">
				<option value="Department">Select</option>
				<option value="HR">HR</option>
				<option value="Developer">Developer</option>
				<option value="Testing">Testing</option>
				<option value="Finance">Finance</option>
				<option value="Others">Others</option>
			</select><br> <br>
			<div>
				<label for="emp_salary"><b>Salary</b></label> <input type="text"
					placeholder="Enter the Salary" name="emp_salary" required><br>
				<br>

			</div>

			<button type="submit">Register</button>
			
				<a href="view">View Details</a>
			

			<hr>
		</div>
	</form>




</body>
</html>