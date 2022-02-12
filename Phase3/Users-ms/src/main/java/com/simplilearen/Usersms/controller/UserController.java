package com.simplilearen.Usersms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/users/status/check")
	public String status() {
		return "working";
	}
	
}
