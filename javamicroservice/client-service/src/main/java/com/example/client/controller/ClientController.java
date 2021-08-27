package com.example.client.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

	@GetMapping("/message")
	public String test() {
		return "Hello !! Called in client Service";
	}
}
