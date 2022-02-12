package com.simplilearn.eventlistner.listners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.eventlistner.events.NewsEvent;

@Component
public class NewsListner {
	
	@EventListener
	public void ListenNewsEvent(NewsEvent ne) {
		System.out.println("News Event published ::");
	}

}
