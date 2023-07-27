package com.xworkz.tanu.Aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LogginAspect {
	
	
	@Before("execution(* com.xworkz.tanu.service.**.**(..))")
	public void logBefore(JoinPoint joinPoint) {
		log.info("Running in before logging");
		System.err.println("Hi manu");
		log.info("Enter:{}() with argument[s] = {}",
				joinPoint.getSignature().getDeclaringTypeName(),
				joinPoint.getSignature().getName(),Arrays.toString(joinPoint.getArgs()));		
		
		}
	
	
	@Before("execution(* com.xworkz.tanu.controller.*CrackerRestController*.*onPost*(..))")
	public void logAfter(JoinPoint joinPoint) {
		log.info("Running in after logging");
		System.err.println("Hi Chaitra");
		log.info("Enter:{}() with argument[s] = {}",
				joinPoint.getSignature().getDeclaringTypeName(),
				joinPoint.getSignature().getName(),Arrays.toString(joinPoint.getArgs()));		
		
		}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
