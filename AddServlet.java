package com.jss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	/*
	 * public void service(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException { int i = Integer.parseInt(req.getParameter("num1")); int j =
	 * Integer.parseInt(req.getParameter("num2"));
	 * 
	 * int k = i+j;
	 * 
	 * System.out.println(k); res.getWriter().println(k);
	 * 
	 * }
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		System.out.println(k);
		//res.getWriter().println(k);
		
		req.setAttribute("k", k);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
		
	}
}
