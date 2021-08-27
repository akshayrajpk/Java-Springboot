package com.example.javabasic.day27.RestTemplate.controller;

import com.example.javabasic.day27.RestTemplate.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collections;

@RestController
public class RestConsumer {
    @Qualifier(value = "defaultRest")
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WebClient webClient;

    @GetMapping(value = "/posts")
    public Post[] getProductList() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        Post[] postsArr =  restTemplate
                .exchange(
                        "https://jsonplaceholder.typicode.com/posts",
                        HttpMethod.GET,
                        entity,
                        Post[].class
                )
               .getBody();
        return postsArr;
    }

    @PostMapping(value = "/posts")
    public String createPost(@RequestBody Post post) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<Post> entity = new HttpEntity<Post>(post, httpHeaders);
        return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts", HttpMethod.POST, entity, String.class).getBody();

    }

    @PutMapping(value = "/posts/{id}")
    public String updatePost(@PathVariable("id") int id, @RequestBody Post post) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<Post> entity = new HttpEntity<>(post, httpHeaders);
        return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts/" + id, HttpMethod.PUT, entity, String.class).getBody();
    }


    @DeleteMapping(value = "/posts/{id}")
    public String deletePost(@PathVariable("id") int id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts/" + id, HttpMethod.DELETE, entity, String.class).getBody();
    }

    @GetMapping("/mono")
    public Mono<Post[]> findMonoAll() // A Mono is a reactor streams publisher that publishes a single element
    {
        Mono<Post[]> result = webClient
                .get()
                .uri("/posts")
                .retrieve()
                .bodyToMono(Post[].class);
        return result;
    }


    @GetMapping("/flux")
    public Flux<Post> findFluxAll()//Flux is a reactor streams publisher that publishes 0 to N elements
    {
        Flux<Post> result=  webClient
                .get()
                .uri("/posts")
                .retrieve()
                .bodyToFlux(Post.class);
        return result;
    }
}
