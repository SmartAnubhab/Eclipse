package com.softech;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		float result=(float)req.getAttribute("r");
		float temp=result;
		result *= result;
		PrintWriter out=res.getWriter();
		out.println("Print message for SqServlet");
		out.println("value of k is : " + temp);
		out.println("So the desired result is " + result);
	}
}
