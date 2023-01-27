package com.xworkz.webseriesapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/location" )
public class LocationServlet extends HttpServlet {
	
	public LocationServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in LocationServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in LocationServlet");
		
		String name = req.getParameter("name");
		if(name.length() >= 5) {
			System.out.println("Valid name");
		}
		else {
			System.out.println("Invalid name");
		}
		
		String email = req.getParameter("email");
		if(email.length() > 8) {
			System.out.println("Valid email");
		}
		else {
			System.out.println("Invalid email");
		}
		
		
		String startPoint = req.getParameter("startPoint");
		if(startPoint.length() > 5) {
			System.out.println("Valid Start Point");
		}
		else {
			System.out.println("Invalid Start Point");
		}
		
		
		String destination = req.getParameter("destination");
		if(destination.length() > 5) {
			System.out.println("Valid Destination");
		}
		else {
			System.out.println("Invalid Destination");
		}
		
		
		String gender = req.getParameter("gender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h2>");
		
		
		if(name.length() >= 5) {
			writer.print("<span style = 'color:green';>");
			writer.print("Sent Successfully");
		}else {
			writer.print("<span style = 'color:red';>");
			writer.print("Unsuccessfull....Invalid name " +" "+ name);
		}
		
		if(email.length() > 12) {
			writer.print("<span style = 'color:green';>");
			writer.print("Sent Successfully");
		}else {
			writer.print("<span style = 'color:red';>");
			writer.print("Unsuccessfull....Invalid email " +" "+ email);
		}
		
		if(startPoint.length() > 5) {
			writer.print("<span style = 'color:green';>");
			writer.print("Sent Successfully");
		}else {
			writer.print("<span style = 'color:red';>");
			writer.print("Unsuccessfull....Invalid startPoint " +" "+ startPoint);
		}
		
		if(destination.length() > 5) {
			writer.print("<span style = 'color:green';>");
			writer.print("Sent Successfully");
		}else {
			writer.print("<span style = 'color:red';>");
			writer.print("Unsuccessfull....Invalid destination " +" "+ destination);
		}
		
	
		writer.print("</span>");
		writer.print("</h2>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
		
	}

}
