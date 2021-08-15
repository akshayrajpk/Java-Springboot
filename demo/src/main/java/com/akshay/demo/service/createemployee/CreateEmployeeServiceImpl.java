package com.akshay.demo.service.createemployee;

import com.akshay.demo.model.Address;
import com.akshay.demo.model.Employee;
import com.akshay.demo.repository.AddressRepository;
import com.akshay.demo.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreateEmployeeServiceImpl implements CreateEmployeeService {

    private static final Logger log = LoggerFactory.getLogger(CreateEmployeeServiceImpl.class);

    @Autowired
    EmployeeRepository empRepo;

    @Autowired
    AddressRepository addressRepo;

    @Autowired
    CreateEmployeeResponse response;

    @Override
    public CreateEmployeeResponse execute(CreateEmployeeRequest request) {

        try {

            this.validateEmailExistsOrNot(request);

            this.saveToDB(request);

            this.setSuccessResponse();

        } catch (Exception e) {
            this.setFailureResponse(e);
            e.printStackTrace();
        }

        return response;
    }

    private void validateEmailExistsOrNot(CreateEmployeeRequest request) throws Exception {
        if (empRepo.existsByEmail(request.getEmail()))
            throw new Exception("Email Id Already Present!");
        else
            log.info("Email Validation Successful");
    }

    private CreateEmployeeResponse setFailureResponse(Exception e) {
        log.error(e.getMessage());

        response.setSuccessful(false);
        response.setMessage(e.getMessage());

        return response;
    }

    private CreateEmployeeResponse setSuccessResponse() {
        log.info("Employee Stored Successfully!");
        response.setSuccessful(true);
        response.setMessage("Employee Stored Successfully!");

        return response;
    }


    private void saveToDB(CreateEmployeeRequest request) {

        Employee emp = new Employee();

        emp.setEmail(request.getEmail());
        emp.setDesignation(request.getDesignation());
        emp.setName(request.getName());

        log.info("Before Persistence -> {}", emp);

        emp = empRepo.save(emp);

        log.info("After Persistence -> {}", emp);

        for (String requestAddress : request.getAddress()) {
            Address address = new Address();
            address.setAddress(requestAddress);
            address.setEmp(emp);

            addressRepo.save(address);
        }


    }
}
