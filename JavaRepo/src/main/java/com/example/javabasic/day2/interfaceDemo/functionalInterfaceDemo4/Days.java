package com.example.javabasic.day2.interfaceDemo.functionalInterfaceDemo4;

//enum class implementing WeekDays interface
enum Days implements WeekDays {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public void displaydays() {
//Override displaydays method
        System.out.println("The day of the week: " + this);
    }

    public void test(){
        System.out.println("This is test method");
    }
}
