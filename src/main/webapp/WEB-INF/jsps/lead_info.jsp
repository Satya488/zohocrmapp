<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
	<h2>Lead Details</h2>
	<table border = "1">
		<tr>
			<td>First Name</td>
			<td>${lead.firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${lead.lastName}</td>
		</tr>
		<tr>
			<td>Email Id</td>
			<td>${lead.email}</td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td>${lead.mobile}</td>
		</tr>
		<tr>
			<td>Source</td>
			<td>${lead.source}</td>
		</tr>
	</table>
	<form action = "sendEmail" method = "post">
	<input type = "hidden" name = "email" value = "${lead.email}"/>
	<input type = "submit" value = "Send Email"/>
	</form>
	
	<form action = "convertLead" method = "post">
	<input type = "hidden" name = "id" value = "${lead.id}"/>
	<input type = "submit" value = "Convert"/>
	</form>
</body>
</html>