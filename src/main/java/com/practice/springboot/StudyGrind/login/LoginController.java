package com.practice.springboot.StudyGrind.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user_name")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String gotToLogin(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String validateLogin(@RequestParam String name, @RequestParam String user_password, ModelMap model){
        Boolean res = authenticationService.authenticateUser(name, user_password);

        if(res){
            model.put("user_name", name);
            return "welcome";
        }
        model.put("error_msg", "invalid credentials. Try again!");
        return "login";
    }


//    //http://localhost:8080/login
//    @RequestMapping("/login")
//    public String goToLogin(@RequestParam String name, ModelMap model){
//        System.out.println("Request param name is:"+name); //Not recommended. USe logging in next step.
//        Logger logger = LoggerFactory.getLogger(getClass());
//        logger.debug("Request param - name = {}",name);
//        model.put("user_name", name);
//        return "login";
//    }
}
