package com.example.client.extClient;

import com.example.client.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "student-service",
        url = "http://localhost:8085/")
public interface StudentFeignClient {
    @RequestMapping(method = RequestMethod.GET,
            value = "/student/allStudent")
    List<Student> getAllStudent();

    @RequestMapping(method = RequestMethod.GET,
            value = "/student/hystrix")
    Student checkHystrix();


}
