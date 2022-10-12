package com.openshift.demodeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test-service")
public class HelloWord {

	@GetMapping
	public String sayHello() {
		return "Hello From Openshift Deployed Service";
	}
	
}
