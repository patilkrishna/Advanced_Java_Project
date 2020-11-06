<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<table align="center" >
	<h2> Payroll Management System </h2>
		<tr>
			<td> <%=request.getAttribute("msg")%></td>
		</tr>
		<tr>
			<td> <a href="index.jsp" >Sign In</a> </td>
		</tr>
	</table>
</body>
</html>