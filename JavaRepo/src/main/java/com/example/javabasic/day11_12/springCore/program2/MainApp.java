package com.example.javabasic.day11_12.springCore.program2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        /*HelloWorld objA = (HelloWorld) context.getBean("helloWorldSingleton");

        objA.setMessage("I'm object A");
        objA.printMessage((ConfigurableApplicationContext) context, "helloWorldSingleton");

        HelloWorld objB = (HelloWorld) context.getBean("helloWorldSingleton");//objB = objA
        objB.getMessage();*/

        /*--------------------PROTOTYPE-------------------*/
       HelloWorld objA = (HelloWorld) context.getBean("helloWorldPrototype");

       objA.setMessage("I'm object A");
       objA.printMessage((ConfigurableApplicationContext) context, "helloWorldPrototype");

       HelloWorld objB = (HelloWorld) context.getBean("helloWorldPrototype");
       objB.getMessage();

       objB.printMessage((ConfigurableApplicationContext) context, "helloWorldPrototype");


    }
}
