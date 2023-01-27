package com.xworkz.webseriesapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
	
	public ContactServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in ContactServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in ContactServlet");
		
	String name = req.getParameter("name");
	if(name.length() >= 5) {
		System.out.println("Valid name");
	}
	else {
		System.out.println("Invalid name");
	}
	
	
	String email = req.getParameter("email");
	if(email.length() >= 8) {
		System.out.println("Valid email");
	}
	else {
		System.out.println("Invalid email");
	}
	
	
	String mobileNumber = req.getParameter("mobileNumber");
	Long convertedMobileNumber = Long.parseLong(mobileNumber);
	if(convertedMobileNumber >= 10) {
		System.out.println("Valid number");
	}
	else {
		System.out.println("Invalid number");
	}
	
	
	String comments = req.getParameter("comments");
	if(comments.length() > 8) {
		System.out.println("Valid comments");
	}
	else {
		System.out.println("Invalid comments");
	}
	
	
	
	System.out.println(name);
	System.out.println(email);
	System.out.println(mobileNumber);
	System.out.println(comments);
	
	PrintWriter writer = resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	writer.print("<h3>");
	writer.print("<span>");
	
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
	
	
	
	if(convertedMobileNumber >= 10) {
		writer.print("<span style = 'color:green';>");
		writer.print("Sent Successfully");
	}else {
		writer.print("<span style = 'color:red';>");
		writer.print("Unsuccessfull....Invalid Mobile Number " +" "+ convertedMobileNumber);
	}
	
	
	
	
	if(comments.length() > 8) {
		writer.print("<span style = 'color:green';>");
		writer.print("Sent Successfully");
	}else {
		writer.print("<span style = 'color:red';>");
		writer.print("Unsuccessfull....Invalid comments " +" "+ comments);
	}
	
	writer.print("</span>");
	writer.print("</h3>");
	writer.print("</body>");
	writer.print("</html>");
	resp.setContentType("text/html");
	
	
	
	
	
	}

}
