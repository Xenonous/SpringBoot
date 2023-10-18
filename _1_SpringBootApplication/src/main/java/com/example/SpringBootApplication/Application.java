package com.example.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// This is the code used to start your Spring application.
		SpringApplication.run(Application.class, args);

	}


	@RestController
	public class HelloWorldRestController {
		@GetMapping("/") // This is the same concept as calling an HTTP GET request using Node.js/Express.js in JavaScript.
		// A method is now ran and whatever is returned inside this method is shown on the web application.
		public String sayHello() {
			return "Hello World!";
		}
	}

}

// When creating a REST Controller you need to specify overload method first to tell the program that we're dealing with a REST Controller

