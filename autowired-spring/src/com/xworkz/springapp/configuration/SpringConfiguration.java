package com.xworkz.springapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springapp")
public class SpringConfiguration {
	
	
	@Bean
	public Integer id() {
		System.out.println("Registering id...");
		return 1234;
	}
	
	@Bean
	public String shopName() {
		System.out.println("Registering shopName...");
		return "Prized Supplies";
	}
	
	@Bean
	public Integer gstNo() {
		System.out.println("Registering gstNo...");
		return 3786251;
	}
	
	@Bean
	public String ownerName() {
		System.out.println("Registering ownerName...");
		return "Siddu";
	}
	
	@Bean
	public String address() {
		System.out.println("Registering address...");
		return "Marathahalli";
	}
	
	
	@Bean
	public String name() {
		System.out.println("Registering name...");
		return "MS Word";
	}
	
	@Bean
	public double version() {
		System.out.println("Registering version...");
		return 10.7;
	}
	
	@Bean
	public String developer() {
		System.out.println("Registering developer...");
		return "Richard Brodie";
	}
	
	@Bean
	public String date() {
		System.out.println("Registering date...");
		return "6th Jan 2000";
	}
	
	@Bean
	public boolean isFree() {
		System.out.println("Registering isFree...");
		return true;
	}
	
	
	
	

	@Bean
	public String engineerName() {
		System.out.println("Registering engineerName...");
		return "Rohith";
	}
	

	@Bean
	public double salary() {
		System.out.println("Registering engineerName...");
		return 65000.43;
	}
	

	@Bean
	public String companyName() {
		System.out.println("Registering companyName...");
		return "Accenture";
	}
	
	@Bean
	public double experience() {
		System.out.println("Registering experience...");
		return 8.5;
	}
	
	
	
	
	@Bean
	public String rubberName() {
		System.out.println("Registering rubberName...");
		return "Nataraj";
	}
	
	@Bean
	public String rubberType() {
		System.out.println("Registering rubberType...");
		return "Ink Eraser";
	}
	
	@Bean
	public double rubberPrice() {
		System.out.println("Registering rubberPrice...");
		return 15.5;
	}
	
	@Bean
	public String rubberColor() {
		System.out.println("Registering rubberColor...");
		return "Pink";
	}
	
	@Bean
	public String rubberShape() {
		System.out.println("Registering rubberShape...");
		return "Rectangle";
	}
	
	@Bean
	public boolean isAvailable() {
		System.out.println("Registering isAvailable...");
		return true;
	}
	
	@Bean
	public String rubberSize() {
		System.out.println("Registering rubberSize...");
		return "small";
	}
	
	
	
	
	

	@Bean
	public String pencilName() {
		System.out.println("Registering pencilName...");
		return "Apsara";
	}
	
	@Bean
	public String pencilType() {
		System.out.println("Registering pencilType...");
		return "Red Pencil";
	}
	
	@Bean
	public double pencilPrice() {
		System.out.println("Registering pencilPrice...");
		return 12.5;
	}
	
	@Bean
	public String pencilColor() {
		System.out.println("Registering pencilColor...");
		return "Red";
	}
	
	@Bean
	public boolean isPencilSharp() {
		System.out.println("Registering isSharpOrBlunt...");
		return true;
	}
	
	@Bean
	public boolean isStolen() {
		System.out.println("Registering isStolen...");
		return false;
	}
	
	
	
	
	
	@Bean
	public String itemName() {
		System.out.println("Registering itemName...");
		return "Kurta";
	}
	
	@Bean
	public double itemPrice() {
		System.out.println("Registering itemPrice...");
		return 1099.9;
	}
	
	@Bean
	public int itemId() {
		System.out.println("Registering itemId...");
		return 789;
	}
	
	@Bean
	public char itemSeries() {
		System.out.println("Registering itemSeries...");
		return 'T';
	}
	
	@Bean
	public boolean isSuccessfull() {
		System.out.println("Registering isSuccessfull...");
		return true;
	}
	
	@Bean
	public long contactNo() {
		System.out.println("Registering contactNo...");
		return 89089089089L;
	}

	
	@Bean
	public float streetNo() {
		System.out.println("Registering streetNo...");
		return 256f;
	}
	
	@Bean
	public byte houseNo() {
		System.out.println("Registering houseNo...");
		return 87;
	}
	
	

	
	
	
	
	
	
	
	

}
