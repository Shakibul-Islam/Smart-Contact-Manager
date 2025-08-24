package com.scm.scm20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    //For about page
    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    //For services page
    @RequestMapping("/services")
    public String services() {
        return "services";
    }

    //For contact page
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    //For login page
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //For signUp page
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}
