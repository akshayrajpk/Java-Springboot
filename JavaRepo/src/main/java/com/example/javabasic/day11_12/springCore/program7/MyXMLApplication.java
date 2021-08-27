package com.example.javabasic.day11_12.springCore.program7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyXMLApplication {
	private MessageService service;

	//constructor-based dependency injection
//	public MyXMLApplication(MessageService svc) {
//		this.service = svc;
//	}
	
	//setter-based dependency injection
	public void setService(MessageService svc){
		this.service=svc;
	}

	public boolean processMessage(String msg, String rec) {
		// some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}
}
