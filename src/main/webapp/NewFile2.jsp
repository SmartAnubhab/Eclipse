<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>2ND JSP PAGE</title>
</head>
<body bgcolor="sky blue">
	<%
	out.println("I AM 2ND JSP PAGE");
	HttpSession session1=request.getSession();
	int b=(int)session1.getAttribute("a");
	out.println("b is " + b);
	%>
	<br>
	<a href="index.html">Main menu</a>
</body>
</html>