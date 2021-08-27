package com.example.javabasic.exercise.day9;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class BundleReader {
    public static void main(String[] args) {
        try {
            ResourceBundle resourceBundle = ResourceBundle
                    .getBundle("cgi");
            Enumeration<String> crunchifyKeys = resourceBundle.getKeys();
            while (crunchifyKeys.hasMoreElements()) {
                String crunchifyKey = crunchifyKeys.nextElement();
                String value = resourceBundle.getString(crunchifyKey);
                System.out.println(crunchifyKey + ": " + value);
            }

            String user = resourceBundle.getString("cgi.username");
            System.out.println(user);

        } catch (Exception e) {
            System.out.println("Error retrieving properties file: " + e);
        }
    }
}
