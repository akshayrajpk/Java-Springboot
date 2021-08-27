package com.example.javabasic.day9.propertiesReading.program1;
/*Read value from application.properties Using @Value*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Value("${email.username}")
    private String username; // username = @Value("${email.username}");
    @Value("${email.pwd}")
    private String pwd; // pwd = @Value("${email.pwd}");
    @Autowired
    private EmailConfig emailConfig;

    public void sendEmail() {
        System.out.println("reading value from propertes file using @value annotation");
        System.out.println("username =" + username);
        System.out.println("pwd =" + pwd);
        System.out.println("emailConfig->"+ emailConfig.toString());
    }
}

