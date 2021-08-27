package com.example.javabasic.day2.interfaceDemo.Akshay;

@FunctionalInterface
public interface IDemoInterface {
	static void staticDemoMethod(){
        System.out.println("In Static Demo Method");
    }
	
	static void staticDemoMethod2(){
        System.out.println("In Static Demo Method 2");
    }
	
	void nonStaticDemoMethod();
//	void nonStaticDemoMethod2();
}
