package com.praveen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praveen.dto.LimitsConfiguration;

@RestController
public class HomeController {
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/limits")
	public LimitsConfiguration getConfig() {
		return new LimitsConfiguration(1000,1);
	}

}
