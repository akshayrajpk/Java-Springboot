package com.akshay.demo.service.updateEmployee;

import com.akshay.demo.constants.MessageConstants;
import com.akshay.demo.model.Address;
import com.akshay.demo.model.Employee;
import com.akshay.demo.repository.AddressRepository;
import com.akshay.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEmployeeServiceImpl implements UpdateEmployeeService {

    @Autowired
    UpdateEmployeeResponse response;

    @Autowired
    AddressRepository addressRepo;

    @Autowired
    EmployeeRepository empRepo;

    @Override
    public UpdateEmployeeResponse execute(UpdateEmployeeRequest request) {
        try {

            Employee updateEmployee = this.validateIdExistsOrNot(request);

            this.updateRecord(request, updateEmployee);

            this.setSuccessResponse();

        } catch (Exception e) {
            this.setFailureResponse(e);
            e.printStackTrace();
        }

        return response;
    }

    private UpdateEmployeeResponse setFailureResponse(Exception e) {
        response.setSuccessful(false);
        response.setMessage(e.getMessage());

        return response;
    }

    private UpdateEmployeeResponse setSuccessResponse() {
        response.setMessage(MessageConstants.UPDATE_SUCCESS);
        response.setSuccessful(true);

        return response;
    }

    private void updateRecord(UpdateEmployeeRequest request, Employee updateEmployee) {

        updateEmployee.setEmail(request.getEmail());
        updateEmployee.setName(request.getName());
        updateEmployee.setDesignation(request.getDesignation());

        updateEmployee = empRepo.save(updateEmployee);

        addressRepo.deleteByEmpId(updateEmployee.getEmpId());

        for (String requestAddress : request.getAddress()) {
            Address address = new Address();

            address.setAddress(requestAddress);
            address.setEmp(updateEmployee);

            addressRepo.save(address);
        }

    }

    private Employee validateIdExistsOrNot(UpdateEmployeeRequest request) throws Exception {

        Employee updateEmployee = empRepo.findById(request.getEmpId()).orElseThrow(() -> new Exception(MessageConstants.NO_DATA_FOUND));

        return updateEmployee;
    }
}
