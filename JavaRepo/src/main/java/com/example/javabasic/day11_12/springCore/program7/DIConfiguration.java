package com.example.javabasic.day11_12.springCore.program7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value={"com.example.javabasic.day11_12.springCore.program7"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageEmailService(){
		return new EmailService();
	}

}
