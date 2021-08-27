package com.universitysecond.universitysecond.Controller;

import com.universitysecond.universitysecond.model.Student;
import com.universitysecond.universitysecond.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/allStudent")
    public List<Student> getAllPosts() {
        List<Student> studentList = studentService.getAllStudent();
        return studentList;
    }

    @GetMapping(value = "/student/hystrix")
    public ResponseEntity<Object> checkHystrix() {
        Student student = studentService.checkHystrix();
        if(student.getId().equals("fallback-1")){
            return  ResponseEntity.internalServerError()
                    .body("Student Service not Available !! Try After Sometime");
        }
        return  ResponseEntity.ok(student);
    }
}
