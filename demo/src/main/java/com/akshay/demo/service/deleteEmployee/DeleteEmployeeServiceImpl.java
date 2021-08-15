package com.akshay.demo.service.deleteEmployee;

import com.akshay.demo.model.Employee;
import com.akshay.demo.repository.EmployeeRepository;
import com.akshay.demo.service.createemployee.CreateEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteEmployeeServiceImpl implements DeleteEmployeeService {

    @Autowired
    EmployeeRepository empRepo;

    @Autowired
    DeleteEmployeeResponse response;

    @Override
    public DeleteEmployeeResponse execute(DeleteEmployeeRequest request) {

        try {
            this.valideteEmployeeExistance(request);

            this.deleteRecord(request);

            this.setSuccessResponse();
        }
        catch (Exception e){
            this.setFailureResponse(e);
            e.printStackTrace();
        }

        return response;
    }

    private void setSuccessResponse() {
        response.setSuccessful(true);
        response.setMessage("Delete Successfull");
    }

    private void deleteRecord(DeleteEmployeeRequest request) {
        empRepo.deleteById(request.getEmpId());
    }

    private void setFailureResponse(Exception e) {
        response.setSuccessful(false);
        response.setMessage(e.getMessage());
    }

    private void valideteEmployeeExistance(DeleteEmployeeRequest request) throws Exception {
        Optional<Employee> empExistance = empRepo.findById(request.getEmpId());

        if(!empExistance.isPresent()){
            throw new Exception("Invalid Employee Id. Cant Delete Record");
        }

    }
}
