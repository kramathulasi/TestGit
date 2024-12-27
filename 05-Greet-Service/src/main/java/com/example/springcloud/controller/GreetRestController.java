package com.example.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeignClient welcomeFeignclient;
	
	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMessage()
	{
		String message = welcomeFeignclient.getMessage();
		return ResponseEntity.ok("Good Morning  "+message);
	}
}
