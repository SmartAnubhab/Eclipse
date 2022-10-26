package com.softech;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException{
		
		
		RequestDispatcher rd=req.getRequestDispatcher("DemoJsp.jsp")
	}
}
