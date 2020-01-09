package com.mohamedali.springdemo.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/random-quote")
	public String randomQuote(){
		String [] randomQuoteStrings = {"today is your lucky day", "today is not a happy day", "today is a mad day"};
		int random = new Random().nextInt(randomQuoteStrings.length);
		return randomQuoteStrings[random];
	
	}

}
