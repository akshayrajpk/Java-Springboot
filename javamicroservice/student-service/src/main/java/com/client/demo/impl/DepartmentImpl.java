package com.client.demo.impl;

import com.client.demo.extClient.DepartmentFeignClient;
import com.client.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentImpl implements DepartmentService {
    @Autowired
    private DepartmentFeignClient departmentFeignClient;

    @Override
    public String getDepById(int id) {
        System.out.println("DEPT IMPLEMENT HIT at STUDENT");
        return departmentFeignClient.getDepById(id);
    }


}
