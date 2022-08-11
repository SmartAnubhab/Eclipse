package com.softech;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		float result=(float)req.getAttribute("result");
//		float temp=result;
//		PrintWriter out=res.getWriter();
//		out.println("value of addition is : " + temp);
//		out.println("value of square is : " + result);
		
		float r=(float)req.getAttribute("rslt");
		
		PrintWriter out=res.getWriter();
		out.println("Sum is : " + r);
		r*=r;
		out.println("Square is : " + r);
		
		
	}
}
