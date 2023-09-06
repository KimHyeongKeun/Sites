package com.example.site.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/login")
    public String Login(){
        return "loginForm";
    }

    @GetMapping("/index")
    public String hello(){
        return "index";
    }


}
