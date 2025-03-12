package com.nt.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DateServlet extends HttpServlet 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
{
	resp.setContentType("text/html");
	PrintWriter pw=resp.getWriter();
	pw.println("<h1>date time is : "+new Date()+"</h1>");
	pw.println("<br><a href='index.html'>Home</a>");
	pw.close();
	
}
	
}
