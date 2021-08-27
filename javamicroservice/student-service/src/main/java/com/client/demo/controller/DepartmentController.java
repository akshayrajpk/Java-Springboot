package com.client.demo.controller;

import com.client.demo.model.Student;
import com.client.demo.repository.StudentRepository;
import com.client.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/getDepartment/{id}")
    public String getDepById(@PathVariable Integer id) {
        System.out.println("Hit"+id);
        String a = departmentService.getDepById(id);
        System.out.println(a);
        return a;
    }

    @PostMapping("/create/{id}")
    public ResponseEntity<Student> createStudent(@RequestBody Student student, @PathVariable Integer id) {

        String a = departmentService.getDepById(id);
        student.setDept(a);
        Student st = studentRepository.save(student);
        return new ResponseEntity("Student created with ID = " + st.getId(),
                HttpStatus.CREATED);
    }
}
