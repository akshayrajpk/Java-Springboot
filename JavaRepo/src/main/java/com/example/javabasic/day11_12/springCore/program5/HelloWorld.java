package com.example.javabasic.day11_12.springCore.program5;
/*By Programmatic Approach*/
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// HelloWorld class which implements the
// interfaces
public class HelloWorld
        implements InitializingBean, DisposableBean {

    @Override
// It is the init() method
// of our bean and it gets
// invoked on bean instantiation
    public void afterPropertiesSet()
            throws Exception {
        System.out.println("=========PROGRAM 5 INIT START===========");
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm the "
                        + "init() method");
        System.out.println("=========PROGRAM 5 INIT END===========");

    }

    @Override
// This method is invoked
// just after the container
// is closed
    public void destroy() throws Exception {
        System.out.println("=========PROGRAM 5 DESTROY START===========");

        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
        System.out.println("=========PROGRAM 5 DESTROY START===========");

    }
}
