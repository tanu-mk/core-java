package com.xworkz.spring.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.xworkz.spring")
public class SpringConfiguration {
	
	
	@Bean
	public Validator validator() {
		System.out.println("Registering Validator");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			return validator;
	
	}
	

}
