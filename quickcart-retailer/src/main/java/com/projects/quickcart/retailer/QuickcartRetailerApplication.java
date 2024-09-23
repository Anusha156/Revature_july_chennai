package com.projects.quickcart.retailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QuickcartRetailerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickcartRetailerApplication.class, args);
	}

}
