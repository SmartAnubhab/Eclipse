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
		
		float a=Float.parseFloat(req.getParameter("num1"));
		float b=Float.parseFloat(req.getParameter("num2"));
		float result=a+b;

		out.println("\n\nThe result is : " + result);
		
		for(int i=0; i<60; i++){
			try {
				out.println(i);
				Thread.sleep(1000);
		    }catch(Exception e){
		    	out.println("Error is sleep " + e);
		    }
		}
	}
}
