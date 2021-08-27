package com.example.javabasic.day18.RestService.Program2;

import java.util.HashMap;
import java.util.Map;

import com.example.javabasic.day18.RestService.model.Product;
import com.example.javabasic.day18.RestService.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentServiceController {
    private static Map<String, Student> studentRepo = new HashMap<>();

    static {
        Student student1 = new Student();
        student1.setId("11");
        student1.setName("John");
        student1.setAddress("USA");
        student1.setAge("31");
        studentRepo.put(student1.getId(), student1);

        Student student2 = new Student();
        student1.setId("22");
        student2.setName("Jack");
        student2.setAddress("UK");
        student2.setAge("35");
       studentRepo.put(student2.getId(), student2);
    }

    @DeleteMapping(value = "/student/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        studentRepo.remove(id);
        return new ResponseEntity<>("Student id = "+id +"is deleted successfully", HttpStatus.OK);
    }

    @PutMapping(value = "/student/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id,
                                                @RequestBody Student  student) {
       studentRepo.remove(id);
       student.setId(id);
       studentRepo.put(id, student);
        return new ResponseEntity<>("student is updated successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/student")
    public ResponseEntity<Object> createProduct(@RequestBody Student  student) {
       studentRepo.put(student.getId(), student);
        return new ResponseEntity<>("STUDENT is created successfully", HttpStatus.CREATED);
    }

    @GetMapping(value = "/student")
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(studentRepo.values(), HttpStatus.OK);
    }
}
