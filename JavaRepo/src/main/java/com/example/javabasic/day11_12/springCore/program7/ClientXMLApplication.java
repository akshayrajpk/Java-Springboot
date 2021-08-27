package com.example.javabasic.day11_12.springCore.program7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"di-applicationContext.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hi Rahul", "Rahul@abc.com");

		// close the context
		context.close();
	}

}
