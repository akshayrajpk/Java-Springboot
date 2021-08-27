package com.example.javabasic.day4.lamdba.program4;

/*Java Lambda Expression with Multiple Parameters*/
@FunctionalInterface
interface StringConcat {
    //String sconcat(String a, String b);
    int sum(int a, int b, int c);
    static int staticMethod(int arg){
        return arg*5;
    }
}

public class Example {
    public static void main(String args[]) {
// lambda expression with multiple arguments
        StringConcat s = (str1, str2,param3) -> str1 + str2+param3;
        //System.out.println("Result: " + s.sconcat("Hello ", "World"));
        System.out.println("Result: " + s.sum(3,5,7));
        System.out.println("-----------------------");
        System.out.println("Static Result: "+ StringConcat.staticMethod(10));
    }
}
