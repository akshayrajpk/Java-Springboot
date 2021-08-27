package com.example.client.controller;

import com.example.client.model.Posts;
import com.example.client.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Posts> getAllPosts() {
        List<Posts> objectList = postService.getAllPosts();
        return objectList;
    }
}
