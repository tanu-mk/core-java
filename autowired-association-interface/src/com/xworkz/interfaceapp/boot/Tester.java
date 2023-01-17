package com.xworkz.interfaceapp.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.interfaceapp.classapp.Chrome;
import com.xworkz.interfaceapp.classapp.Firefox;
import com.xworkz.interfaceapp.configuration.SpringConfiguration;
import com.xworkz.interfaceapp.interfaceapp.Browser;
import com.xworkz.interfaceapp.interfaceapp.PetrolBunk;

public class Tester {
	
	public static void main(String[] args) {
		
	ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
	PetrolBunk bunk = container.getBean(PetrolBunk.class);
	bunk.toPurchase();
	
	
	
	System.out.println("=============================================");
	
	Chrome chromeRef = container.getBean(Chrome.class);
	chromeRef.browse();
	
	Firefox firefoxRef = container.getBean(Firefox.class);
	firefoxRef.browse();
		
		
	}

}
