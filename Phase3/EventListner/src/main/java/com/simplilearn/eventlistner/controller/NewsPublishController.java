package com.simplilearn.eventlistner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.eventlistner.publisher.NewsEventPublisher;

@Controller
public class NewsPublishController {
	
	@Autowired
	NewsEventPublisher newsEventPublisher;

	@GetMapping("/toi/publish")
	public String publish() {
		newsEventPublisher.publish();
		return "published";
	}

}
