package com.spring.client.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class SpringClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringClient1Application.class, args);
	}

	@Value("${server.port}")
	String port;
	
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "Hi " + name + ", I'm from port :" + port;
	}
}
