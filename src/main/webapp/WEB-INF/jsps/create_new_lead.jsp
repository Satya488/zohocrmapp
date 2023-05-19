<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
	<h2>Create Lead Here</h2>
	<form action="save" method = "post">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Email ID</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td>Source :</td>
				<td><select name="source">
						<option value="radio">radio</option>
						<option value="news paper">news paper</option>
						<option value="trade show">trade show</option>
						<option value="website">website</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" name="Save" /></td>
			</tr>
		</table>
	</form>
</body>
</html>