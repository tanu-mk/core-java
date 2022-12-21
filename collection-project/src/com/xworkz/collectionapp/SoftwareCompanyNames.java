package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyNames {
	
	public static void main(String[] args) {
		
		String company1 = "Accenture";
		String company2 = "Infosys";
		String company3 = "Wipro";
		String company4 = "IBM";
		String company5 = "Signus";
		String company6 = "Lollypop";
		String company7 = "Cognizant";
		String company8 = "TCS";
		String company9 = "Harman";
		String company10 = "Samsung";
		String company11 = "Bosch";
		String company12 = "LG Soft";
		String company13 = "Oracle";
		String company14 = "Microsoft";
		String company15 = "Facebook";
		String company16 = "Sonata Software";
		String company17 = "ADP";
		String company18 = "Splunk";
		String company19 = "Cyient";
		String company20 = "SAP";
		
		Collection<String> companies = new ArrayList<String>();
		
		companies.add(company20);
		companies.add(company19);
		companies.add(company18);
		companies.add(company17);
		companies.add(company16);
		companies.add(company15);
		companies.add(company14);
		companies.add(company13);
		companies.add(company12);
		companies.add(company10);
		companies.add(company11);
		companies.add(company9);
		companies.add(company8);
		companies.add(company7);
		companies.add(company6);
		companies.add(company5);
		companies.add(company4);
		companies.add(company3);
		companies.add(company2);
		companies.add(company1);
		
		
		for(String str : companies) {
			System.out.println(str);
		}
		
		
		System.out.println("===========After using iterator==========");
		
		 Iterator<String> value = companies.iterator();		
		
		 while(value.hasNext()) {
			 String data = value.next();		
			 System.out.println(data);
			 
		 }
	}

}
