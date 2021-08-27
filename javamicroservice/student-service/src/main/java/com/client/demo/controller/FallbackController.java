package com.client.demo.controller;

import com.client.demo.model.Student;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class FallbackController {

	@RequestMapping(value = "/hystrix", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "getDataFallBack")
	public Student firstPage() {

		Student student = new Student();
		student.setName("John");
		student.setId("99");

		if(student.getName().equalsIgnoreCase("John")){
			throw new RuntimeException();
			//ANY CODE which will throw Exception
		}
		return student;
	}

	public Student getDataFallBack() {
		Student emp = new Student();
		emp.setName("fallback-manager");
		emp.setId("fallback-1");
		return emp;
	}
	
}
