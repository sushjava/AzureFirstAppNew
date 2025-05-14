package com.java_Maven_Project.FirstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstAppApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Congrats you successfully created and deployed a First webApp!";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
		
	}

}
