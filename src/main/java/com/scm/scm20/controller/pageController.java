package com.scm.scm20.controller;

import com.scm.scm20.form.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String register(Model model){

        UserForm userForm = new UserForm();
        userForm.setName("Tota");
        model.addAttribute("userForm",userForm);

        return "register";
    }

    //Processing rigister
    @RequestMapping(value = "/do-rigister", method = RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm){
        System.out.println(userForm);
        return "redirect:/register";
    }

}
