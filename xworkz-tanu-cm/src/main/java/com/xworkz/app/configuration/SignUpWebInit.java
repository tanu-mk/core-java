package com.xworkz.app.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SignUpWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	
	
	public SignUpWebInit() {
	log.info("Created " + this.getClass().getSimpleName());
	}
	

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses");
		return new Class[] { SignUpConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings");
		return new String[] { "/" };
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		log.info("Running configureDefaultServletHandling");
		configurer.enable();
	}
	

}
