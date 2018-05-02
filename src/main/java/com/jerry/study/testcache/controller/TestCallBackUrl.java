package com.jerry.study.testcache.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
public class TestCallBackUrl {

    private Logger logger = LogManager.getLogger(TestCallBackUrl.class);

    @RequestMapping("/testCallBackUrl")
    public String getRequest(HttpServletRequest request){

        Enumeration<String> parameterNames = request.getParameterNames();

        for(Enumeration e=parameterNames;e.hasMoreElements();){

            String thisName=e.nextElement().toString();
            String thisValue=request.getParameter(thisName);
            logger.info(thisName+"--------------"+thisValue);

        }

        return "success";
    }
}
