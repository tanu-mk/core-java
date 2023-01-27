package com.xworkz.kingapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup =2, urlPatterns = "/king")
public class KingServlet extends HttpServlet{

	public KingServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in King");
		
		String name = req.getParameter("King name");
		String region = req.getParameter("region");
		String noOfQueens = req.getParameter("NoOfQueens");
		String dob = req.getParameter("DOB");
		String dod = req.getParameter("DOD");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(dob);
		System.out.println(dod);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h3>");
		writer.print("<span style = 'color:maroon;'>");
		writer.print("King" +" "+ name + " "+ "id loaded Successfully");
		writer.print("</span");
		writer.print("</h3>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
		
		
		
		
		
		
	}
	
}
