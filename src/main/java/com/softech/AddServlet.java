package com.softech;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.util.http.parser.Cookie;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		float k=0;
		out.println("Initial value of k is : " + k);
		jakarta.servlet.http.Cookie[] cookies=req.getCookies();
		
		for	(jakarta.servlet.http.Cookie c: cookies) {
			if(c.getName().equals("result")) {
				k=Float.parseFloat(c.getValue());
				out.println("The value passed here is : " + k);
			}
		}
		
		
//		out.println("Input 1 : " + a);
//		out.println("Input 2 : " + b);
		
		
	}
}
