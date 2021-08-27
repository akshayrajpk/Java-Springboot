package com.example.client.impl;

import com.example.client.extClient.PostFeignClient;
import com.example.client.model.Posts;
import com.example.client.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostFeignClient postFeignClient;

    @Override
    public List<Posts> getAllPosts() {
        return postFeignClient.getAllPosts();
    }
}
