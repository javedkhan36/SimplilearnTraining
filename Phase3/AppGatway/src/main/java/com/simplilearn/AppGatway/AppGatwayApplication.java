package com.simplilearn.AppGatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppGatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGatwayApplication.class, args);
	}

}
