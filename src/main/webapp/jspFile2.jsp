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
		out.println("I endup being here in jsp file 2.");
		int a=4;
	%>
	<br>
	
	<%
		out.println("hello im the second line");
		out.println("value of a is : " + a);
	%>
</body>
</html>