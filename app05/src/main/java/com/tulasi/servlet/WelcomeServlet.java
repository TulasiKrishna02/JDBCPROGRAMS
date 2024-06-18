package com.tulasi.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
      
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		LocalTime localTime=LocalTime.now();
		int hour=localTime.getHour();
		String message="";
		if(hour<12) {
			message="GoodMorning";
		}else if(hour<17){
			message="Good Afternoon";
		}else {
			message="GoodEvening";
		}
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:red;text-align:center;'>");
		out.println("Hello client"+message);
		out.println("<hr></h1></body></html>");
	}

}
