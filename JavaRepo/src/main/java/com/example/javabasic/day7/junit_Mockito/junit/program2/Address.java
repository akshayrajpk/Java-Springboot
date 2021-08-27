package com.example.javabasic.day7.junit_Mockito.junit.program2;

public class Address {
    private String firstName;
    private String lastName;

    public Address() {
    }

    public Address(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
