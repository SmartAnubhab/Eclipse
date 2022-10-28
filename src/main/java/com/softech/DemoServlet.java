package com.softech;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//This code is not working, we need to check it later
		//This servlet page supposed to go to Demo.jsp
		//Problem is index.html is not ending up into this page
		
		String name="Anubhab Mondal";
		request.setAttribute("MyName", name);
		
		RequestDispatcher rd=request.getRequestDispatcher("DemoJsp.jsp");	
		rd.forward(request, response);
	}
}
