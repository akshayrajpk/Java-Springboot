package com.example.javabasic.day13.springMVC.program1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
 
    @GetMapping("/hello")
    public String hello() {
        return "helloworld";
    }
 
}
