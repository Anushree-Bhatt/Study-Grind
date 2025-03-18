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

    //html page of saying greetings when I click on /say-hello-html url
    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head><title>Welcome page</title></head>");
        sb.append("<body>");
        sb.append("<h3 align = 'center' >Hi! Welcome! How're you doing?</h3>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}
