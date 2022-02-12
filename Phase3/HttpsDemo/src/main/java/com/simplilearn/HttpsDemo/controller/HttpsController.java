package com.simplilearn.HttpsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {
	
	@GetMapping("/greet")
	public String test() {
		return "This is unsafe!!!!";
	}

}
