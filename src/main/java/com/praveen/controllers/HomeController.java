package com.praveen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praveen.config.Configuration;
import com.praveen.dto.LimitsConfiguration;

@RestController
public class HomeController {
	
	@Autowired
	private Configuration config;
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/limits")
	public LimitsConfiguration getConfig() {
		
		return new LimitsConfiguration(config.getMaximum(),config.getMinimum());
	}

}
