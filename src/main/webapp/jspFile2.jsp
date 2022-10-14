<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp File II</title>
</head>
<body bgcolor="LightGray">
	<%int j=1; 
	while(j<=5){
		out.println("<h"+j+">");
	%>
	<%
	
		out.println("header");
	
	%>
	<%
		out.println("</h"+j+">");
	j++;
	}
	%>
	<a href="index.html">Home page</a>
</body>
</html>