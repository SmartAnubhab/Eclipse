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
	for(int i=0; i<5; i++){
		out.println("header");
	}
	%>
	<a href="index.html">Home page</a>
</body>
</html>