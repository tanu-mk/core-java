package com.xworkz.streetapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/street")
public class AreaServlet extends HttpServlet {
	
	public AreaServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running goGet in Street");
		
		String name = req.getParameter("Street name");
		String pincode = req.getParameter("Pincode");
		String crossNo = req.getParameter("Cross No");
		String streetNo = req.getParameter("Street No");
		String areaName = req.getParameter("Area name");
		String noOfShops = req.getParameter("No Of Shops");
		String noOfHouses = req.getParameter("No Of Houses");
		String present = req.getParameter("present");
		String landmark = req.getParameter("Landmark");
		String noOfStreetLights = req.getParameter("No Of StreetLights");
		String medicalStores = req.getParameter("No of MedicalStores");
		String layoutName = req.getParameter("Layout name");
		String post = req.getParameter("Post");
		String noOfTemples1 = req.getParameter("No of Temples");
		String park = req.getParameter("Park");
		String playGround = req.getParameter("PlayGround");
		String hospital = req.getParameter("Hospital");
		String serviceCenters = req.getParameter("Service Centers");
		String totalMembers = req.getParameter("Total members");
		String school = req.getParameter("School");
		
		System.out.println(name);           
		System.out.println(pincode);			
		System.out.println(crossNo);
		System.out.println(streetNo);
		System.out.println(areaName);
		System.out.println(noOfShops);
		System.out.println(noOfHouses);
		System.out.println(present);
		System.out.println(landmark);
		System.out.println(noOfStreetLights);
		System.out.println(medicalStores);
		System.out.println(layoutName);
		System.out.println(post);
		System.out.println(noOfTemples1);
		System.out.println(park);
		System.out.println(playGround);
		System.out.println(hospital);
		System.out.println(serviceCenters);
		System.out.println(totalMembers);
		System.out.println(school);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h3>");
		writer.print("<span style : 'color: maroon';>");
		writer.print("Area" + " "+ name + " "+ "loaded successfully");
		writer.print("</span>");
		writer.print("</h3>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("type/html");
		
	}

}
