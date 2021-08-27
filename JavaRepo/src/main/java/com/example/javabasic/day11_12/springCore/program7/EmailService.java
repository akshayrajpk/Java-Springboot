package com.example.javabasic.day11_12.springCore.program7;

public class EmailService implements MessageService {
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Email Sent to "+rec+ " with Message="+msg);
		return true;
	}

}
