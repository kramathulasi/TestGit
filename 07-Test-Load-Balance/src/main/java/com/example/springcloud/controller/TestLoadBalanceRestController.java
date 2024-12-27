package com.example.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLoadBalanceRestController {
	
	@Autowired
	private LoadBalancingFeignClient loadBalanceFeignclient;
	
	@GetMapping("/test-load-balance")
	public ResponseEntity<String> getMessage()
	{
		String message = loadBalanceFeignclient.getMessage();
		return ResponseEntity.ok("Good Morning  "+message);
	}
}
