package com.simplilearn.Kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private static final String TOPIC = "i am javed khan";
	
	public void publish(String message) {
		kafkaTemplate.send(TOPIC, message);
	}
	

}
