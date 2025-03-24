package com.practice.springboot.StudyGrind.login;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public Boolean authenticateUser(String user_name, String user_password){
        Boolean name = user_name.equalsIgnoreCase("anushree");
        Boolean pwd = user_password.equalsIgnoreCase("anu@123");

        return name && pwd;
    }

}
