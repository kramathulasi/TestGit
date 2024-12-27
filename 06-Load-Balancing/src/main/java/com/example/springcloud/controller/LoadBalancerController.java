package com.example.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalancerController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/loadbalance")
	public ResponseEntity<String> getMessage()
	{
		String portNumber = env.getProperty("server.port");
		return ResponseEntity.ok("Welcome to Spring Cloud Load Balancing Port Number::"+portNumber);
	}

	public LoadBalancerController(Environment env)
	{
		this.env = env;
	}
}
