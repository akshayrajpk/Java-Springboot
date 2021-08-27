package com.example.javabasic.day9.propertiesReading.program1;
/*Read application.properties Using using Environment object*/
import com.example.javabasic.day9.propertiesReading.program1.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private Environment env;

    @Autowired
    EmailService emailService;

    @GetMapping("/sendmail")
    public String sendMail() {
        System.out.println("values from application properties using Environment ");
        System.out.println("username =" + env.getProperty("email.username"));
        System.out.println("pwd =" + env.getProperty("email.pwd"));

        emailService.sendEmail();

        return "Email Sent";
    }
}
