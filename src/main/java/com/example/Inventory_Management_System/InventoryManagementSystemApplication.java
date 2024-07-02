package com.example.Inventory_Management_System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class InventoryManagementSystemApplication implements WebMvcConfigurer {
=======

@SpringBootApplication
public class InventoryManagementSystemApplication {
>>>>>>> 6e315042e6a19c0290370aa9c6e623a6f6982a82

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemApplication.class, args);
	}
<<<<<<< HEAD
	@Bean
	public CustomerController.AuthInterceptor authInterceptor() {
		return new CustomerController.AuthInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authInterceptor())
				.addPathPatterns("/Display/**")
				.excludePathPatterns("/", "/Login", "/Register"); // Exclude login page and login endpoint
	}
=======
>>>>>>> 6e315042e6a19c0290370aa9c6e623a6f6982a82

}
