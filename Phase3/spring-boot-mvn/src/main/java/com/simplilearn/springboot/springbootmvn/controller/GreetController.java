package com.simplilearn.springboot.springbootmvn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {
	
	@GetMapping("/g1")
	public  String greeting(@RequestParam(name="name", required=false, defaultValue="ye bhi thik hai!!")String name, Model model) {
		
		model.addAttribute("name", name);
		
		return "hello";
	}

}
