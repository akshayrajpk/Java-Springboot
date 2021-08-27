package com.example.javabasic.day2.interfaceDemo.functionalInterface;

public class Test implements TestInterface {
    @Override
    public void nonStaticMethod() {
        System.out.println("In Test Class:: nonStaticMethod ");
    }
}
