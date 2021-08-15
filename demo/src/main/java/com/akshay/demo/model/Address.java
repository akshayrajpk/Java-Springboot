package com.akshay.demo.model;

import javax.persistence.*;

@Entity(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private  long addId;

    @Column(name = "address")
    private  String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id")
    private Employee emp;

    public long getAddId() {
        return addId;
    }

    public Address() {
    }

    public String getAddress() {
        return address;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setAddId(long addId) {
        this.addId = addId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addId=" + addId +
                ", address='" + address + '\'' +
                ", emp=" + emp +
                '}';
    }
}
