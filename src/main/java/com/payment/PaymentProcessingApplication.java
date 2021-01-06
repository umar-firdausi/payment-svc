package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PaymentProcessingApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext c = SpringApplication.run(PaymentProcessingApplication.class, args);
		
		System.out.println("Welcome to Spring Boot - Payment Processing Application");
	}

}
