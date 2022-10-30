<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP FILE TESTER</title>
</head>
<body bgcolor="sky blue">


	<%
	int a=Integer.parseInt(request.getParameter("num"));
	HttpSession session1=request.getSession();
	session1.setAttribute("a", a);
		out.println("I AM JSP TEST FILE");
		
			
	response.sendRedirect("NewFile2.jsp");
	%>
</body>
</html>