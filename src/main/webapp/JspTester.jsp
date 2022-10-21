<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="MediumSeaGreen">
	<h3>h3 JSP page</h3>
	<br>
	<hr>
	<%
	float a=Float.parseFloat( request.getParameter("num1"));
	float b=Float.parseFloat( request.getParameter("num2"));
	float addition=a+b;
	
	
	%>
	<br>
	<%
	response.sendRedirect("add.jsp");
	%>
</body>
</html>