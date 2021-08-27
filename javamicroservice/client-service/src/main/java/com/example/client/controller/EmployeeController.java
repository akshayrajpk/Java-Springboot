package com.example.client.controller;

import com.example.client.model.Employee;
import com.example.client.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        Employee emp = employeeRepository.save(employee);//Step 1
        /*List<Employee> employeeList = employeeRepository.filterEmployeeOnSalary((float) emp.getSalary());
        System.out.println("########################################");
        System.out.println(employeeList);
        System.out.println("########################################");*/
        return new ResponseEntity<>("Employee create with ID = " + emp.getId(),
                HttpStatus.CREATED);
    }

    @GetMapping("/allExpenses")
    public ResponseEntity<List<Employee>> getAllExpense() {
        List<Employee> empList = employeeRepository.findAll();
        return new ResponseEntity("Expense List " + empList, HttpStatus.OK);

    }
}
