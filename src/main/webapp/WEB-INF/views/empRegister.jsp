<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<div align = "center">
	<h1>Employee Registration Form</h1>
	<form action="<%= request.getContextPath() %>/register" method = "post">
		<table style="width: 85%" align = "center">
		<tr>
			<td>Name</td>
			<td><input type = "text" name = "name"/></td>
		</tr>
		
		<tr>
			<td>Username</td>
			<td><input type = "text" name = "username"/></td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type = "password" name = "password"/></td>
		</tr>
		
		<tr>
			<td>Phone</td>
			<td><input type = "text" name = "phone"/></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><input type = "text" name = "email"/></td>
		</tr>
		</table>
	
		<input type = "submit" value="Submit"/>
	</form>
	
	</div>
</body>
</html>