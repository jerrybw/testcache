package com.jerry.study.testcache.controller;

import com.jerry.study.testcache.bean.User;
import com.jerry.study.testcache.mapper.UserMapper;
import com.jerry.study.testcache.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/loginAct")
    public Object login(User user, HttpSession session, HttpServletResponse response){
        return loginService.login(user,session,response);
    }
}
