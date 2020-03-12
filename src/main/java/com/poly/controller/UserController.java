package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user/")
public class UserController {

    @RequestMapping(value = "home")
    public String homePage(){
        return "home";
    }

}
