package com.ms.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication annotation tells Spring Boot that this is a stating point for Spring Boot Application.
@SpringBootApplication
public class CourseCatalogApp {

	public static void main(String[] args) {
		// the line below basically tells Spring Boot to creates a servlet container 
		// and host this Spring Boot application inside that servlet container.
		SpringApplication.run(CourseCatalogApp.class, args);
		// above line does following things - 
		// 1. Sets up default configuration.
		// 2. Starts Spring application context.
		// 3. Performs class path scan.
		// 4. Starts Tomcat server.
	}
}
