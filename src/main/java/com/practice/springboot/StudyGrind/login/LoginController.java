package com.practice.springboot.StudyGrind.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    //http://localhost:8080/login?name=Anushree Bhat
    @RequestMapping("/login")
    public String goToLogin(@RequestParam String name, ModelMap model){
//        System.out.println("Request param name is:"+name);
//        model.put("user_name", name);
        model.put("user_name", name); //Not recommended. USe logging in next step.
        return "login";
    }
}
