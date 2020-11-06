<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<spr:form action="reg.htm" method="post" commandName="user" >
	<table align="center" >
	
	<h2> Payroll Management System </h2>
		<tr>
			<td>
				User-mail:
			</td>
			<td>
				<spr:input path="userName"/>
			</td>
		</tr>
		<tr>
			<td>
				Password:
			</td>
			<td>
				<spr:password path="userPass"/>
			</td>
		</tr>
		<tr>
			<td>
				Gender:
			</td>
			<td>
			Male :	<input type="checkbox"  value="Male">
			Female :<input type="checkbox"  value="female">
			Other :	<input type="checkbox"  value="other">
			</td>
		</tr>
		<tr>
			<td>
				city:
			</td>
			<td>
				<input type="text" >
			</td>
		</tr>
		<tr>
			<td>
				designation:
			</td>
			<td>
				<input type="text">
			</td>
		</tr><tr>
			<td>
				mb_no:
			</td>
			<td>
				<input type="text"   >
			</td>
		</tr>
		
		<tr>
			<td>
				<a href="index.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Register" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>