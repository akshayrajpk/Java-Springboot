package com.example.client.impl;

import com.example.client.extClient.StudentFeignClient;
import com.example.client.model.Student;
import com.example.client.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentFeignClient studentFeignClient;

    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList =  studentFeignClient.getAllStudent();
        return studentList;
    }

    @Override
    public Student checkHystrix() {
        return studentFeignClient.checkHystrix();
    }
}
