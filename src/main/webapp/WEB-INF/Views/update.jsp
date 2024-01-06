<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update </title>
</head>
<body>

<form action="update" method="post">
	<table>
		
		<tr>
		<td>Email:</td>
		<td><input type="text" name="email" value="<%=request.getAttribute("email") %>"></td>
		</tr>
		
		<tr>
		<td>Phone :</td>
		<td><input type="tel" name ="phone" value="<%=request.getAttribute("phone")%>"></td>
		</tr>
		
		<tr>
		<td><input type="submit" value="Update"></td>
		</tr>
		
		
	</table>
	</form>

</body>
</html>