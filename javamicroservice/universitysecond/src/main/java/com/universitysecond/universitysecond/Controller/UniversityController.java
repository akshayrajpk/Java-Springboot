package com.universitysecond.universitysecond.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {
    @GetMapping("/message")
    public String test() {
        return "Hello !! Called in University Service";
    }
}
