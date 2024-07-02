package com.example.Inventory_Management_System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class InventoryManagementSystemApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemApplication.class, args);
	}
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

}
