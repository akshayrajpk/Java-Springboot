package com.example.javabasic.day9.propertiesReading.program1;
/*Read value from application.properties Using @ConfigurationProperties*/

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("email")
public class EmailConfig {
    private String username; // username = myemail.username(test)
    private String pwd; //pwd = myemail.pwd (pwdtest)

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "EmailConfig [username=" + username + ", pwd=" + pwd + "]";
    }
    //myemail
    //emailConfig->EmailConfig [username=test, pwd=pwdtest]

    //email
    //emailConfig->EmailConfig [username=javaBatch, pwd=12345]
}
