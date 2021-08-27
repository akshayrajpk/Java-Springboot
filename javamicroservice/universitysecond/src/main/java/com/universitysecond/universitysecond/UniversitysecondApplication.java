package com.universitysecond.universitysecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UniversitysecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversitysecondApplication.class, args);
	}

}
