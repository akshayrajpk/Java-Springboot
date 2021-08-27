package com.example.client.service;

import com.example.client.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student checkHystrix();

}
