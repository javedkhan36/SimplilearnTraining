package com.simplilearn.phase3rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.phase3rest.model.Greet;

@RestController
public class GreetController {
	
	@RequestMapping(value="/greetMe", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Greet greet( ) {
		
		Greet greet = new Greet();
		greet.setName("javed");
		greet.setMessage("this is programming world!");
		
		return greet;
	}

}
