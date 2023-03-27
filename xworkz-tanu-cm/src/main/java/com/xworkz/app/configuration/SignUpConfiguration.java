package com.xworkz.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.app")
@Slf4j
public class SignUpConfiguration {
	

	public SignUpConfiguration() {
		log.info("Created " + this.getClass().getSimpleName());
	}
	
	
	@Bean
	@Order(1)
	public ViewResolver viewResolver() {
		log.info("Registering with ViewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		log.info("Registering localContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
		
	}
	//public DataSource
	

}
