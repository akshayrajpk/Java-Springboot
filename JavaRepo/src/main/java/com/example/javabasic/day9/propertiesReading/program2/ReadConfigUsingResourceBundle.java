package com.example.javabasic.day9.propertiesReading.program2;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class ReadConfigUsingResourceBundle {
	public static void main(String[] args) {

		try {
			ResourceBundle resourceBundle = ResourceBundle
					.getBundle("user1");
			Enumeration<String> crunchifyKeys = resourceBundle.getKeys();
			while (crunchifyKeys.hasMoreElements()) {
				String crunchifyKey = crunchifyKeys.nextElement();
				String value = resourceBundle.getString(crunchifyKey);
				System.out.println(crunchifyKey + ": " + value);
			}
 
		} catch (Exception e) {
			System.out.println("Error retrieving properties file: " + e);
		}
	}
}
