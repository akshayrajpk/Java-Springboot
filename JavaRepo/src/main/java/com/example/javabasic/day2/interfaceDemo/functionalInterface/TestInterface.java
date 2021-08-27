package com.example.javabasic.day2.interfaceDemo.functionalInterface;

@FunctionalInterface
public interface TestInterface {
    /*
    * Note:
    * If we are declaring an Interface as FunctionalInterface using @FunctionalInterface
      Then it will have
    * Only ONE Default/Abstract method DECLARATION
    * And can Have multiple Static Methods DEFINITION
     * */

    //static method DEFINITION
    static void staticMethod(){
        System.out.println("In Static Method");
    }



    //abstract method DECLARATION
    void nonStaticMethod();


}
