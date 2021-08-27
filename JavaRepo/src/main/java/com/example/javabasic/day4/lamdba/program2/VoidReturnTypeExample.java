package com.example.javabasic.day4.lamdba.program2;

@FunctionalInterface
interface VoidReturnTypeInterface{
    void printMessage();
}
public class VoidReturnTypeExample {
    public static void main(String[] args) {
        VoidReturnTypeInterface obj =
                ()-> System.out.println("Hello!! I have no Return Type");
        obj.printMessage();
       }
}
