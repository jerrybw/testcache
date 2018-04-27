package com.jerry.study.testcache.test;

import com.jerry.study.testcache.TestcacheApplication;
import com.jerry.study.testcache.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    @Test
    public void test() throws Exception {
//        // 保存字符串
//        stringRedisTemplate.opsForValue().set("aaa", "111");
//        Assert.assertEquals("111","111");
        RedisProperties redisProperties = new RedisProperties();

    }

    @Test
    public void test1() throws Exception {
//        // 保存对象
//        User user = new User(1,"超人", "123","123");
//        redisTemplate.opsForValue().set(user.getName(), user);
//        user = new User(1,"蝙蝠侠", "1234","123");
//        redisTemplate.opsForValue().set(user.getName(), user);
//        user = new User(1,"蜘蛛侠", "12345","123");
//        redisTemplate.opsForValue().set(user.getName(), user);
//        Assert.assertEquals("123", redisTemplate.opsForValue().get("超人").getPassword());
//        Assert.assertEquals("1234", redisTemplate.opsForValue().get("蝙蝠侠").getPassword());
//        Assert.assertEquals("12345", redisTemplate.opsForValue().get("蜘蛛侠").getPassword());
    }
}