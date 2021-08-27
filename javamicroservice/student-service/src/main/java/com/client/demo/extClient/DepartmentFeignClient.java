package com.client.demo.extClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "department-service", url = "http://localhost:8086/")
public interface DepartmentFeignClient {
//    @RequestMapping(method = RequestMethod.GET,
//            value = "/department/getDepartment/{id}")
    @GetMapping("department/getDepartment/{id}")
    String getDepById(@PathVariable int id);
}
