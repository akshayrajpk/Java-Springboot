package com.example.javabasic;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication (exclude = { SecurityAutoConfiguration.class }) // Comment this if Security required
//@SpringBootApplication
@RestController
@EnableJpaRepositories
@EnableMongoRepositories
@OpenAPIDefinition(info=@Info(title="Swagger Demo for CGI Batch"))

public class DemoApplication {

	@GetMapping("/test")///http://localhost:8080/test -> Spring is here!
	String home() {
		return "Spring is here!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
