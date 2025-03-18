package com.practice.springboot.StudyGrind.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    //"Hi! How're you doing?" when I click on /say-hello url
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hi! How're you doing?";
    }
}
