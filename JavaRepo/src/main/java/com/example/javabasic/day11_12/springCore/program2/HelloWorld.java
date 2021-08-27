package com.example.javabasic.day11_12.springCore.program2;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void printMessage(ConfigurableApplicationContext context, String sourceBean) {
       String beanScope = this.getScope(context,sourceBean);
       System.out.println("====================================");
       System.out.println(" SOURCE BEAN:: "+sourceBean );
       System.out.println(" BEAN SCOPE :: "+beanScope );
       System.out.println("Your Message : " + message);
       System.out.println("====================================");
    }

    private String getScope(ConfigurableApplicationContext context, String sourceBean) {
        BeanDefinition beanDefinition = context.getBeanFactory().getMergedBeanDefinition(sourceBean);
        return beanDefinition.getScope();
    }
}
