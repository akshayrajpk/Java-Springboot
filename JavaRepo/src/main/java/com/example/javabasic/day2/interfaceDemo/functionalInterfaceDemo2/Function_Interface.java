package com.example.javabasic.day2.interfaceDemo.functionalInterfaceDemo2;

//declare a functional interface
@FunctionalInterface
//annotation indicates it’s a functional interface
interface Function_Interface {

    void disp_msg(String msg); // abstract method

    // Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}
