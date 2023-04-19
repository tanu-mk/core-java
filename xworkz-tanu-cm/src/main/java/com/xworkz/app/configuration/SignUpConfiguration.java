package com.xworkz.app.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
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
		bean.setPackagesToScan("com.xworkz.app.entity");
		bean.setDataSource(dataSource());
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return bean;
		
	}
	
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/egg");
		dataSource.setPassword("root");
		dataSource.setUsername("root"
				+ "");
		return dataSource;
	}
	
	
	@Bean
	public PasswordEncoder encoder() {
		log.info("Registering the PasswordEncoder");
		return new BCryptPasswordEncoder();
	}
	

	@Bean
	public MultipartResolver multipartResolver() {
		log.info("Running in multipartResolver");
		return new StandardServletMultipartResolver();
	}
	
	

}
