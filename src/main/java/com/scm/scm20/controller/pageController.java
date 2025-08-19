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
}
