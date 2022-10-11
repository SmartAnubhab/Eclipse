<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="MediumSeaGreen">
	<h3>h3 reference</h3>
	<br>
	<hr>
	<%
	int a=Integer.parseInt( request.getParameter("num1"));
	int b=Integer.parseInt( request.getParameter("num2"));
	int result = a+b;
	

	
	response.sendRedirect("jspFile2.jsp");
	%>
</body>
</html>