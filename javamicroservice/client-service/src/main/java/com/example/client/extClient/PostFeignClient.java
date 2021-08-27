package com.example.client.extClient;

import com.example.client.model.Posts;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "postFeignClient",
        url = "https://jsonplaceholder.typicode.com")
public interface PostFeignClient {
    @GetMapping("/posts")
    List<Posts> getAllPosts();

    @GetMapping("/posts/{id}")
    Posts getPosts(int id);


}
