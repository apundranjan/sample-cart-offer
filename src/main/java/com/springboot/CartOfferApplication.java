package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot")
public class CartOfferApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartOfferApplication.class, args);
	}
}
