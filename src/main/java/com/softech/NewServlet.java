package com.softech;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		out.println("Hello.... \nI am a servlet.");
		float a=Float.parseFloat(req.getParameter("num1"));
		float b=Float.parseFloat(req.getParameter("num2"));
		float result = a + b;
		RequestDispatcher rd=req.getRequestDispatcher("\sq");
		rd.forward(req, res);
	}
}
