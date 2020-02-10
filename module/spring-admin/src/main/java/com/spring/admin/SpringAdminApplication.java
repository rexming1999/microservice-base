package com.spring.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class SpringAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdminApplication.class, args);
	}

}
