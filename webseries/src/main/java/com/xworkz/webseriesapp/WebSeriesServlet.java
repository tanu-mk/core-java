package com.xworkz.webseriesapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/series" )
public class WebSeriesServlet extends HttpServlet{
	
	public WebSeriesServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in webSeries");
		
		String name = req.getParameter("SeriesName");
		String platform = req.getParameter("platform");
		String language = req.getParameter("language");
		String episodes = req.getParameter("episodes");
		String budget = req.getParameter("budget");
		
		System.out.println(name);
		System.out.println(platform);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(budget);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h3>");
		writer.print("<span style = 'color:red'>");
		writer.print("Web Series" + name + " " + "is sent successfully");
		writer.print("</span");
		writer.print("<h3>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
	
	

}
