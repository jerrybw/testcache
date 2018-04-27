package com.jerry.study.testcache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

    @RequestMapping("/")
    public String index(){
        System.out.println("gotoIndex");
        return "index.html";
    }

    @RequestMapping("/gotoLogin")
    public String gotoLogin(){
        System.out.println("gotoLogin");
        return "login.html";
    }
}
