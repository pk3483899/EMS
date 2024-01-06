<%@page import="java.sql.ResultSet"%>
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
	<table border='1px'>
	<br><br>
	<h3>Employee Details</h3>
	<br>
		<tr>
			<th>Name</th>
			<th>City</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Delete</th>
			<th>Update</th>
			
		</tr>

		<%
		try {
			ResultSet str = (ResultSet) request.getAttribute("result");

			while (str.next()) {
		%>
		<tr>
			<td><%=str.getString(1)%></td>
			<td><%=str.getString(2)%></td>
			<td><%=str.getString(3)%></td>
			<td><%=str.getString(4)%></td>
			<td><a href="delete?email=<%=str.getString(3)%>">delete</a></td>
			<td><a href="update?email=<%=str.getString(3)%>&phone=<%=str.getString(4)%>">update</a></td>
		</tr>
			
		<%
		
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		%>
	</table>
	</center>
</body>
</html>