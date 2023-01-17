package com.xworkz.interfaceapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.interfaceapp")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Configuration obj created");
	}

}
