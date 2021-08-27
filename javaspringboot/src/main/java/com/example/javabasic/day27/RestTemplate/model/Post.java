package com.example.javabasic.day27.RestTemplate.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post {
    private String userId;
    private int id;
    private String title;
    private String body;


}
