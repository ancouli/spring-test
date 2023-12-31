package com.example.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	private void testSpotbugs() {
		Integer i = 0;
		while(i != null) {
			i += 0;
		}
	}
	
	private void testSpotbugsAThirdTime() {
		Integer i = 1;
		while(i != null) {
			i += 0;
		}
	}

}
