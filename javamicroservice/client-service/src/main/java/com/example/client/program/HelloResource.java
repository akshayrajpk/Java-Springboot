package com.example.client.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/rest/hello/client")
@RequestMapping("/consumer")
public class HelloResource {


    @Autowired
    private RestTemplate restTemplate;


    /*@HystrixCommand(fallbackMethod = "fallback", groupKey = "Hello",
            commandKey = "hello",
            threadPoolKey = "helloThread"
            )*/
    @GetMapping
    public String hello() {
        String url = "http://hello-server/rest/hello/server";
        return restTemplate.getForObject(url, String.class);
    }

    public String fallback(Throwable hystrixCommand) {
        return "Fall Back Hello world";
    }

}
