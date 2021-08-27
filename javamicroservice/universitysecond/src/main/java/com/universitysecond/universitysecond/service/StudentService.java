package com.universitysecond.universitysecond.service;

import com.universitysecond.universitysecond.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student checkHystrix();
}
