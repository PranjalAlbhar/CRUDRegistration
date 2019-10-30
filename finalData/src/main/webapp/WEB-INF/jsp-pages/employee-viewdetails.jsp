
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<h1>Employees List</h1>

	<%--
	*************************Whole data*****************
	
	 <c:forEach items="${allData}" var="item">
    ${item}<br>
</c:forEach> --%>
	<table border="2" width="70%">
		<tr>
			
			<th>Employee Name</th>
			<th>MobileNo</th>
			<th>MailId</th>
			<th>Password</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>Address</th>
			<th>JoiningDate</th>
			<th>Department</th>
			<th>Salary</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="item">
			<tr>
			
				<td>${item.emp_name}</td>
				<td>${item.emp_mobileNumber}</td>
				<td>${item.emp_mailId}</td>
				<td>${item.password}</td>
				<td>${item.emp_DOB}</td>
				<td>${item.emp_gender}</td>
				<td>${item.emp_address}</td>
				<td>${item.emp_JDate}</td>
				<td>${item.emp_department}</td>
				<td>${item.emp_salary}</td>

				<td><a href="editemp/${item.emp_Id}">Edit</a></td>
				<td><a href="deleteemp/${item.emp_Id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="employee-registrationform">Add New Employee</a>

</body>
</html>
