package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/speakers")
    public String speakers(){
        return "speakers";
    }

    @RequestMapping("/schedule")
    public String schedule(){
        return "schedule";
    }

    @RequestMapping("/venue")
    public String venue(){
        return "venue";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }


}
