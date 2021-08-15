package com.akshay.demo.service.fetchEmps;

import com.akshay.demo.service.CommonServiceResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchEmpResponse extends CommonServiceResponse {

    private List<EmpDTO> emps;

    public FetchEmpResponse() {
    }

    public List<EmpDTO> getEmps() {
        return emps;
    }

    public void setEmps(List<EmpDTO> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "FetchEmpResponse{" +
                "emps=" + emps +
                '}';
    }
}
