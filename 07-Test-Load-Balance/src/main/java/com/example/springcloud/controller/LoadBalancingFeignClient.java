package com.example.springcloud.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="06-LOAD-BALANCING") // Application from Eureka server of welcome service
public interface LoadBalancingFeignClient {
	
	@GetMapping("/loadbalance")
	public String getMessage();

}
