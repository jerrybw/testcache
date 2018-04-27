package com.jerry.study.testcache.service;

import com.jerry.study.testcache.mapper.UserMapper;
import com.jerry.study.testcache.bean.User;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;

    private Logger logger = LogManager.getLogger(LoginService.class);

    public Object login(User user, HttpSession session, HttpServletResponse response){
        logger.info("接到登陆请求：请求参数user:"+user);
        Map<String,Object> result = new HashMap<>();
        try {
            User resultUser = userMapper.getUserByNameAndPassword(user);
            if(resultUser != null){
                result.put("code","200");
                result.put("user",resultUser);
                session.setAttribute("user",resultUser);
                String JSessionId = session.getId();
                Cookie cookie = new Cookie("JSESSIONID",JSessionId);
                cookie.setMaxAge(2*7*24*3600);
                response.addCookie(cookie);
            }else {
                result.put("code","404");
            }
        }catch (Exception e){
            result.put("code","500");
        }
        return result;
    }
}
