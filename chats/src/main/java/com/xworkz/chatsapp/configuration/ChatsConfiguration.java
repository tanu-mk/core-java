package com.xworkz.chatsapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.chatsapp")
public class ChatsConfiguration {
	
	
	public ChatsConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Registering with ViewResolver.....");
		return new InternalResourceViewResolver("/", ".jsp");
	}
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Created LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
	}
	
	

}
