package com.xworkz.displayapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/favourite")
public class DisplayInfoServlet extends HttpServlet{
	
	public DisplayInfoServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in DisplayInfoServlet");
		
		String fname = req.getParameter("Fname");
		String lname = req.getParameter("Lname");
		String gender = req.getParameter("gender");
		String reason = req.getParameter("reason");
		String address = req.getParameter("address");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		req.setAttribute("Fname", fname);
		req.setAttribute("Lname", lname);
		req.setAttribute("Gender", gender);
		req.setAttribute("Reason", reason);
		req.setAttribute("Address", address);

		dispatcher.forward(req, resp);
	}
	

}
