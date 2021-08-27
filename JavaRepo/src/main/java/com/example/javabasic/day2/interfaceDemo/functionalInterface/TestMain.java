package com.example.javabasic.day2.interfaceDemo.functionalInterface;

public class TestMain {
    public static void main(String[] args) {
        Test test = new Test();
        test.nonStaticMethod(); // We have declared in Interface @FuntionInterface
        System.out.println("==========================");
        TestInterface.staticMethod(); // Already having method definition in @FuntionalInterface
    }
}
