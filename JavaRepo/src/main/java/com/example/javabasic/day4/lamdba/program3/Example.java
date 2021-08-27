package com.example.javabasic.day4.lamdba.program3;

/*Java Lambda Expression with single parameter*/
@FunctionalInterface
interface MyFunctionalInterface {
    //A method with single parameter
    public int incrementByFive(int a);
}

public class Example {
    public static void main(String args[]) {
// lambda expression with single parameter num
        MyFunctionalInterface f = (num) -> num + 5;
        System.out.println(f.incrementByFive(20));
    }
}
