package com.example.springcloud.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="04-WELCOME-SERVICE") // Application from Eureka server of welcome service
public interface WelcomeFeignClient {
	
	@GetMapping("/welcome")
	public String getMessage();

}
