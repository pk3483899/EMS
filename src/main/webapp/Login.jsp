<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=skyblue>
<center>
	<table>

	<form action="Login" method="post">
	<tr><center><h3>Login</h3></center></tr>
	
	
	<tr>
		<td>User Name :</td><td><input type="text" name="uname" /> <br> <br></td>
		</tr>
		<tr>
		<td>Password :</td><td><input type="password" name="pass" /><br></td>
		</tr>
		<tr>
		 
		<td>    </td>	<td><input type="Submit" value="Login" /></td>
		</tr>
	<tr>
	<td></td>
	<td>
	<%
	if(request.getAttribute("msg")!=null)
	out.print(request.getAttribute("msg"));	
	%></td>
	</tr>
	</form>
	</table>
	</center>
</body>
</html>