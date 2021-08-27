package com.example.javabasic.exercise.day7;

public class DaytestExercise {
    public int calculate(int a, int b) { return a*b; }
}

class AddressExercise{
    private String firstName;
    private String lastName;

    public AddressExercise(String a, String b){
        this.firstName = a;
        this.lastName = b;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}