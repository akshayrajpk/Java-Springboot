package com.example.javabasic.day2.interfaceDemo.functionalInterfaceDemo2;

public class FunctionalInterfaceExampleMain {
    public static void main(String[] args) {
//create object of implementation class and call method
        FunctionalInterfaceExample finte =
                new FunctionalInterfaceExample();
        finte.disp_msg("Hello, World!!!");

        // use lambda expression to create the object
//        new Thread(() ->
//        {
//            System.out.println(
//                    "New thread created with functional interface"
//            );
//        }).start();
    }
}
