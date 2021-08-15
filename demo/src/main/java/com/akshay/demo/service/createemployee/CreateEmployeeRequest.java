package com.akshay.demo.service.createemployee;

import java.util.List;

public class CreateEmployeeRequest {
    private String email;
    private String name;
    private String designation;
    private List<String> address;

    public CreateEmployeeRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CreateEmployeeRequest{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", address=" + address +
                '}';
    }
}
