package com.example.javabasic.day11_12.springCore.program4;

public class HelloWorld {
    // This method executes
// automatically as the bean
// is instantiated
    public void init() throws Exception {
        System.out.println("===============INIT START===============");
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm "
                        + "the init() method");
        System.out.println("================INIT END================");

    }


    // This method executes
// when the spring container
// is closed
    public void destroy() throws Exception {
        System.out.println("===============DESTROY START===============");
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
        System.out.println("===============DESTROY END===============");

    }
}
