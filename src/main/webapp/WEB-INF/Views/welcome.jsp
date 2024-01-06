<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome tab</title>
</head>
<body bgcolor=skyblue	>
<center>
<h1>Welcome</h1>
<table>
<tr>
<form action="insert" method="post">
</tr>
<tr>

<td>Name:</td><td><input type="text" name="name"/><br></td>
</tr>
<tr>

<td>City :</td><td> <input type="text" name="city"/><br></td>
</tr>
<tr>
<td>Email Id :</td><td><input type="email" name="email"/><br></td>
</tr>
<tr>
<td>Phone No:</td><td> <input type="tel" name="phone"/><br></td>
</tr>
<td></td>
<td><input type="submit" value="save"/><br></td>
</tr>
</form>
<tr>
<td></td>
<td>
	<%
	if(request.getAttribute("msg")!=null)
	out.print(request.getAttribute("msg"));
	%>
	</td>
	</tr>
	</table>
	</center>
</body>
</html>