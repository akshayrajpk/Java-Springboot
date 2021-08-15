package com.akshay.demo.service.deleteEmployee;

public class DeleteEmployeeRequest {
    private long empId;

    public DeleteEmployeeRequest() {
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "DeleteEmployeeRequest{" +
                "empId=" + empId +
                '}';
    }
}
