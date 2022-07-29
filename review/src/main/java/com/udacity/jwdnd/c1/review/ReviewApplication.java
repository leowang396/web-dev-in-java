package com.udacity.jwdnd.c1.review;

import com.udacity.jwdnd.c1.review.services.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Primary
	@Bean
	public String message() {
		System.out.println("message initialized!");
		return "Hello, Spring!";
	}

	@Bean
	public String uppercaseMessage(MessageService service) {
		System.out.println("uppercaseMessage initialized!");
		return service.uppercase();
	}

	@Bean
	public String lowercaseMessage(MessageService service) {
		System.out.println("lowercaseMessage initialized!");
		return service.lowercase();
	}
}
