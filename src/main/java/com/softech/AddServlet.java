package com.softech;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		
		out.println("hello, this is AddServlet");
		
		float a=Float.parseFloat((String)req.getAttribute("num1"));
		float b=Float.parseFloat((String)req.getAttribute("num2"));
		float result=a+b;
		
		out.println("\n\nThe result is : " + result);
	}
}
