package com.jerry.study.testcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate strRedisTemplate;


    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/redis")
    public String testRedis(String paramName,String paramValue){
        String result;
        strRedisTemplate.opsForValue().set(paramName,paramValue);
        redisTemplate.opsForList().leftPush("a", "aa").toString();
        Object a = redisTemplate.opsForList().leftPop("a");
        System.out.println(a.toString());
        return strRedisTemplate.opsForValue().get(paramName);

    }
}
