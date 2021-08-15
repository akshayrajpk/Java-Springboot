package com.akshay.demo.controller;

import com.akshay.demo.service.CommonServiceResponse;
import com.akshay.demo.service.createemployee.CreateEmployeeRequest;
import com.akshay.demo.service.createemployee.CreateEmployeeResponse;
import com.akshay.demo.service.createemployee.CreateEmployeeService;
import com.akshay.demo.service.deleteEmployee.DeleteEmployeeRequest;
import com.akshay.demo.service.deleteEmployee.DeleteEmployeeResponse;
import com.akshay.demo.service.deleteEmployee.DeleteEmployeeService;
import com.akshay.demo.service.fetchEmps.FetchEmpResponse;
import com.akshay.demo.service.fetchEmps.FetchEmpService;
import com.akshay.demo.service.updateEmployee.UpdateEmployeeRequest;
import com.akshay.demo.service.updateEmployee.UpdateEmployeeResponse;
import com.akshay.demo.service.updateEmployee.UpdateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @Autowired
    UpdateEmployeeService updateEmployeeService;

    @Autowired
    CreateEmployeeService createEmployeeService;

    @Autowired
    FetchEmpService fetchEmpService;

    @Autowired
    DeleteEmployeeService deleteEmployeeService;

    @PostMapping("/create-emp")
    public ResponseEntity<CommonServiceResponse> createEmployee(@RequestBody CreateEmployeeRequest request) {
        CreateEmployeeResponse response = createEmployeeService.execute(request);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/fetch-emp")
    public ResponseEntity<FetchEmpResponse> fetchEmps() {
        FetchEmpResponse response = fetchEmpService.execute();
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/delete-emp")
    public ResponseEntity<DeleteEmployeeResponse> deleteEmployeeById(@RequestBody DeleteEmployeeRequest request) {
        DeleteEmployeeResponse response = deleteEmployeeService.execute(request);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/update-emp")
    public ResponseEntity<UpdateEmployeeResponse> updateEmployee(@RequestBody UpdateEmployeeRequest request) {
        UpdateEmployeeResponse response = updateEmployeeService.execute(request);
        return ResponseEntity.ok().body(response);
    }
}
