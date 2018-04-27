package com.jerry.study.testcache.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SessionController {

    private Logger logger = LogManager.getLogger(SessionController.class);

    @GetMapping("/session/{paramName}")
    public Object getAttribute(HttpSession session, @PathVariable("paramName") String paramName){
        logger.info("查询session中的参数，参数名："+paramName);
        Map<String,Object> result = new HashMap<>();
        Object paramValue = session.getAttribute(paramName);
        if(paramValue != null){
            result.put("code","200");
            result.put("user",paramValue);
        }else {
            result.put("code", "404");
        }
        logger.info("结果："+result);
        return result;
    }
}
