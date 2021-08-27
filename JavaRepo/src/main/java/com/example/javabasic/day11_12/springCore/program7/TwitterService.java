package com.example.javabasic.day11_12.springCore.program7;

public class TwitterService implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter message Sent to "+rec+ " with Message="+msg);
		return true;
	}

}
