package com.akshay.demo.service.fetchEmps;

public class AddressDTO {

    private  long addId;
    private  String address;

    public AddressDTO() {
    }

    public long getAddId() {
        return addId;
    }

    public void setAddId(long addId) {
        this.addId = addId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "addId=" + addId +
                ", address='" + address + '\'' +
                '}';
    }
}
