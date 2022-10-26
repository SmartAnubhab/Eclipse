package com.softech;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		
		String name="Anubhab Mondal";
		
		RequestDispatcher rd=req.getRequestDispatcher("DemoJsp.jsp");
		rd.forward(req, res);
	}
}
