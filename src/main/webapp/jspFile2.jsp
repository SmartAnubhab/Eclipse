<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp File II</title>
</head>
<body bgcolor="LightGray">
	<%
		int a,b,result;
		out.println("I endup being here in jsp file 2.");
		a = (int) session.getAttribute("a");
		b = (int) session.getAttribute("b");
		result = a+b;
	%>
	<br>
	
	<%
		out.println("hello im the second line");
	%><br>
	<%
		out.println("value of a is : " + result);
	%>
	<a href="index.html">Home page</a>
</body>
</html>