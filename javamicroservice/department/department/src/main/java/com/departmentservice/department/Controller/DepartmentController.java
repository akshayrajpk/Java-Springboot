package com.departmentservice.department.Controller;

import com.departmentservice.department.model.Department;
import com.departmentservice.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;

    @PostMapping("/insertDepartment")
    public String addDepartment(@RequestBody Department department){
        Department dep = departmentRepository.save(department);
        return("Department added with Id" + dep.getId());
    }

    @GetMapping("/getDepartment/{id}")
    public String getDepById(@PathVariable int id) {
//        String name = "";
//        System.out.println("DEpartment Is hit:"+id);
//          Optional<Department> a = departmentRepository.findById(id);
//          return a.toString();

        String departmentName;
        Optional<Department> dep=departmentRepository.findById(id);
        departmentName=dep.get().getDepartmentName();
        return departmentName;
    }
}
