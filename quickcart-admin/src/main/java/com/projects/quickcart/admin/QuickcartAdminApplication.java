package com.projects.quickcart.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QuickcartAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickcartAdminApplication.class, args);
	}

}
