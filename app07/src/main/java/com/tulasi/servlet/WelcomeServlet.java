package com.tulasi.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static {
		System.out.println("WelcomeServlet:ServletLoading");
	}
	public WelcomeServlet() {
		System.out.println("WelcomeServlet:Servlet Instantiation");
	}
	public void init()throws ServletException{
		System.out.println("WelcomeServlet:servlet-Initialization");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("WelcomeServlet:Requesti Processing");
	}

	public void destroy() {
		System.out.println("WelcomeServlet:De-Instantiation");
	}

}
