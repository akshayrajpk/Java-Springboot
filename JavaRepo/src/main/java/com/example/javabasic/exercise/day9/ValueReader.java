package com.example.javabasic.exercise.day9;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueReader {
    @Value("${cgi.git}")
    private String gitUrl;
    @Value("${cgi.username}")
    private String userName;
    @Value("${cgi.password}")
    private String password;

    public void mains() {
        System.out.println("gitUrl "+gitUrl);
        System.out.println("userName "+userName);
        System.out.println("password "+password);
    }

    public static void main(String[] args) {
        ValueReader valueReader = new ValueReader();
        valueReader.mains();
    }

}
