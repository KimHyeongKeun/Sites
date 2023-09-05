package com.example.site;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/login")
    public String Login(){
        return "login";
    }

    @GetMapping("/index")
    public String hello(){
        return "index";
    }


}
