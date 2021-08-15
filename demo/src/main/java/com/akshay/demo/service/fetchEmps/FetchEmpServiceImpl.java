package com.akshay.demo.service.fetchEmps;

import com.akshay.demo.repository.AddressRepository;
import com.akshay.demo.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FetchEmpServiceImpl implements FetchEmpService {

    private static final Logger log = LoggerFactory.getLogger(FetchEmpServiceImpl.class);


    @Autowired
    EmployeeRepository empRepo;

    @Autowired
    AddressRepository addressRepo;

    @Autowired
    FetchEmpResponse response;

    @Override
    public FetchEmpResponse execute() {
        try {
            this.fetchEmps();

            this.setSuccessResponse();

        } catch (Exception e) {
            this.setFailureResponse(e);
            e.printStackTrace();
        }

        return response;
    }

    private FetchEmpResponse setFailureResponse(Exception e) {
        log.error(e.getMessage());
        response.setMessage(e.getMessage());
        response.setSuccessful(false);

        return response;
    }

    private FetchEmpResponse setSuccessResponse() {

        log.info("Fetch Success");
        response.setSuccessful(true);
        response.setMessage("Fetch Success");

        return response;
    }

    private void fetchEmps() throws Exception {

        List<EmpData> empDatas = empRepo.findAllEmps();

        if (empDatas == null || empDatas.isEmpty())
            throw new Exception("No Data Found!");

        List<EmpDTO> emps = new ArrayList<EmpDTO>();

        empDatas.forEach(empData -> {
            EmpDTO emp = new EmpDTO();

            emp.setDesignation(empData.getDesignation());
            emp.setName(empData.getName());
            emp.setEmpId(empData.getEmpId());
            emp.setEmail(empData.getEmail());

            List<AddressData> addressDatas = addressRepo.findAddressOfEmp(empData.getEmpId());

            List<AddressDTO> addressDTOS = new ArrayList<AddressDTO>();

            for (AddressData addressData : addressDatas) {
                AddressDTO addressDTO = new AddressDTO();

                addressDTO.setAddress(addressData.getAddress());
                addressDTO.setAddId(addressData.getAddId());

                addressDTOS.add(addressDTO);
            }

            emp.setAddress(addressDTOS);

            emps.add(emp);
        });

        response.setEmps(emps);
    }
}
