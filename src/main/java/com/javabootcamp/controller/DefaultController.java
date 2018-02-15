package com.javabootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String home(){ return "/orders";}

    @GetMapping("/odrders")
    public String orders(){return "/orders";}

    @GetMapping("/login")
    public String login(){return "/login";}

    @GetMapping ("/admin")
    public String admin(){return "/admin";}

    @GetMapping("/user")
    public String user(){return "/user";}

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
