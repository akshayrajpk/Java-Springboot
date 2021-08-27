package com.example.javabasic.Exercise.Day16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepo repository;

    @GetMapping("/findAllStudent")
    public List<Student> getStudents() {

        return repository.findAll();
    }

    @GetMapping("/findAllStudent/{id}")
    public Optional<Student> getStudent(@PathVariable String id) {

        return repository.findById(id);
    }

    @PostMapping("/addStudent")
    public String saveStudent(@RequestBody Student student) {
        repository.save(student);
        return "Added Student with id : " + student.getId();
    }

    @DeleteMapping("/remove/{id}")
    public String deleteStudent(@PathVariable String id) {
        repository.deleteById(id);
        return "Student with id " + id + " is removed";
    }


}
