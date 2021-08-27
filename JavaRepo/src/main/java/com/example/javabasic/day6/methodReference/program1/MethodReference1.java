package com.example.javabasic.day6.methodReference.program1;
/*Functional interface and referring a static method to it's functional method say().*/
interface Sayable {
    void say();
}

public class MethodReference1 {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
// Referring static method
        Sayable sayable = MethodReference1::saySomething;
// Calling interface method
        sayable.say();
    }
}
