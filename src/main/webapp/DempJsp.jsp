<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="sky blue">
	<h3>Demo servlet called me.</h3>
	
	<%
	String name=request.getAttribute("MyName").toString();
	out.println("Value is " + name);
	%>
	
</body>
</html>