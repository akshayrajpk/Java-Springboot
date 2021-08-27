package com.client.demo.controller;

import com.client.demo.model.Student;
import com.client.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/message")
	public String test() {
		return "Hello !! Called in student Service";
	}

	@GetMapping("/allStudent")
	public List<Student> getAllStudent(){
		/*Student s1 =  new Student("1","JOHN");
		Student s2 =  new Student("2","MARK");
		Student s3 =  new Student("3","STEVE");*/
		return studentRepository.findAll();
		//return Arrays.asList(s1,s2,s3);

	}

	@PostMapping("/create")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student st = studentRepository.save(student);
		return new ResponseEntity("Student created with ID = " + st.getId(),
				HttpStatus.CREATED);
	}
}
