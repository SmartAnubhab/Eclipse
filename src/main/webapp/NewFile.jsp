<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP FILE TESTER</title>
</head>
<body bgcolor="sky blue">

	<form action="jspFile2.jsp">
		<label><strong>Enter your name</strong></label>
		<input type="text" name="enteredText"><br>
		<button type="submit">Print</button>
		<button type="reset">Reset</button>
	</form>
	<%
	
		out.println("I AM JSP TEST FILE");
		
			
	//response.sendRedirect("NewFile2.jsp");
	%>
</body>
</html>