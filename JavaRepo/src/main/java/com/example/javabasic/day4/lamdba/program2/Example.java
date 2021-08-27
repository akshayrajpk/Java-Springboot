package com.example.javabasic.day4.lamdba.program2;

/*Java Lambda Expression with no parameter*/

@FunctionalInterface
interface MyFunctionalInterface {
    //A method with no parameter
    public String sayHello();
}

public class Example {
    public static void main(String args[]) {
        // lambda expression
        MyFunctionalInterface withReturnType =
                () -> {
                    return "Hello";
                };
        System.out.println(withReturnType.sayHello());
    }
}
