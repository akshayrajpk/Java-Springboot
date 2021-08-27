package com.example.javabasic.day11_12.springCore.program6;
/*Bean Lifecycle implementation using Annotation*/
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// HelloWorld class
public class HelloWorld {
    // Annotate this method to execute it
// automatically as the bean is
// instantiated


    @PostConstruct
    public void init() throws Exception {
        System.out.println("=========PROGRAM 6 INIT START ===========");
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm the "
                        + "init() method");
        System.out.println("=========PROGRAM 6 INIT END ===========");
    }

    // Annotate this method to execute it
// when Spring container is closed
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("=========PROGRAM 6 DESTROY END ===========");

        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
        System.out.println("=========PROGRAM 6 DESTROY END ===========");

    }
}
