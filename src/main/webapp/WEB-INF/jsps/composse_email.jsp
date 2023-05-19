<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
	<form action = "triggerEmail" method = "post">
		<table border="1">
			<tr>
				<td>To</td>
				<td><input type="text" name="email" value="${email}" /></td>
			</tr>
			<tr>
				<td>Subject</td>
				<td><input type="text" name="Subject" /></td>
			</tr>
			<tr>
				<td><textarea name="Content" rows="10" cols="50"></textarea></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Send" /></td>
			</tr>
		</table>
	</form>
	${msg}
</body>
</html>