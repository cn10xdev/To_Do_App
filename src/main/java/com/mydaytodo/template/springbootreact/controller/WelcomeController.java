package com.mydaytodo.template.springbootreact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    @ResponseBody
    public String welcome() {
        return "<html>"
                + "<head><title>Welcome</title></head>"
                + "<body>"
                + "<h1>Welcome to your todos!</h1>"
                + "</body>"
                + "</html>";
    }
}
