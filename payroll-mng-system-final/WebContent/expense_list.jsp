<%@page import="com.cdac.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	
	<table align="center" >
	
	     <h2> Payroll Management System </h2>
		<%
			List<Employee> elist = (List<Employee>)request.getAttribute("expList");
				for(Employee exp : elist){
		%>
		<tr>
			<td>
				<%=exp.getItemName()%>
			</td>
			<td>
				<%=exp.getPrice()%>
			</td>
			<td>
				<%=exp.getPurchaseDate()%>
			</td>
			<td>
				<a href="expense_delete.htm?expenseId=<%=exp.getExpenseId()%>">Delete</a>
			</td>
			<td>
				<a href="expense_update_form.htm?expenseId=<%=exp.getExpenseId()%>">Update</a>
			</td>
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				
			</td>
		</tr>
	</table>
	
</body>
</html>