package com.example.javabasic.Exercise.Day18;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeControler {
    public static Map<String, Employee> employeeDetails = new HashMap<>();

    static {
        Employee e1 = new Employee();
        e1.setName("A");
        e1.setAge("2");
        e1.setAddress("Ad1");
        e1.setId("1");
        employeeDetails.put(e1.getId(),e1);
    }

    @GetMapping(value = "/employee/{id}")
    public ResponseEntity<Object> getEmployeeByID(@PathVariable("id") String id){
        return new ResponseEntity<>(employeeDetails.get(id), HttpStatus.OK);
    }

    @GetMapping(value = "/employee")
    public ResponseEntity<Object> getEmployee(){
        return new ResponseEntity<>(employeeDetails.values(), HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable("id") String id){
        employeeDetails.remove(id);
        return new ResponseEntity<>("Employee has been deleted successfully", HttpStatus.OK);
    }

    @PutMapping(value = "/employee/{id}")
    public ResponseEntity<Object> updateEmployee(@PathVariable("id") String id,
                                                 @RequestBody Employee employee){
        employeeDetails.remove(id);
        employee.setId(id);
        employeeDetails.put(id, employee);
        return new ResponseEntity<>("Employee details has been updated successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/employee")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee){
        employeeDetails.put(employee.getId(),employee);
        return new ResponseEntity<>("Employee created successfully", HttpStatus.CREATED);
    }





}
