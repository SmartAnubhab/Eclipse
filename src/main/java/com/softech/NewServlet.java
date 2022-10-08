package com.softech;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class NewServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		float a=Float.parseFloat(req.getParameter("num1"));
		float b=Float.parseFloat(req.getParameter("num2"));
		float result = (float) a + b;
		
		HttpSession session=req.getSession();
		session.setAttribute("result",result);
		session.setAttribute("a", a);
		session.setAttribute("b", b);
		
		Cookie cookie=new Cookie("result", result + "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
				
	}
}
