<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Expense Form</title>
</head>
<body>
	<spr:form action="expense_add.htm" method="post" commandName="expense" >
	<table align="center" >
	
	
	    <h2> Payroll Management System </h2>
		<tr>
			<td>
				Employee :
			</td>
			<td>
				<spr:input path="itemName"/>
			</td>
		</tr>
		<tr>
			<td>
				salary:
			</td>
			<td>
				<spr:input path="price"/>
			</td>
		</tr>
		<tr>
			<td>
				Joining Date:
			</td>
			<td>
				<spr:input path="purchaseDate"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Add" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>