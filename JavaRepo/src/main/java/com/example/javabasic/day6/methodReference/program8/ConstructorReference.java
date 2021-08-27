package com.example.javabasic.day6.methodReference.program8;
/*Reference to a Constructor*/
interface Messageable {
    Message getMessage(String msg);
}

class Message {

    Message(String msg) {
        System.out.println("I am in Constructor");
        System.out.print(msg);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Messageable messageableObject = Message::new;
        messageableObject.getMessage("ABC");
    }
}
