package com.tulasi.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static {
    	System.out.println("HelloServlet:ServletLoading");
    }
    public HelloServlet() {
       System.out.println("ServletInstantiation");
    }
    public void init() {
    	System.out.println("Servlet Initialization");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println("Request Processing");
	}

	public void destroy() {
		System.out.println("Servlet De-Instantiation");
	}

}
