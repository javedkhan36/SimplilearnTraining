package com.simplilearen.Accountms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
	
	@GetMapping("/accounts/status/check")
	public String status() {
		return "Accounts-ms is working";
	}

}
