package com.nt.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/wish")
public class WishMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("WishMessage.doGet()");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		LocalTime ltime=LocalTime.now();
		int hour=ltime.getHour();
		if(hour<12)
			pw.println("<h1 style='color:red;align:center'>GoodMorning</h1>");
		else if(hour<16)
			pw.println("<h1 style='color:maroon;align:center'>GoodAfternoon</h1>");
		else
			pw.println("<h1 style='color:green;align:center'>Good Evening</h1>");
		
		
		pw.println("<br> <a href='index.jsp'>Home</a>");
		pw.close();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("WishMessage.doPost()");
		doGet(req,res);
	}
	
}