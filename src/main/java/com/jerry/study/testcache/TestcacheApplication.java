package com.jerry.study.testcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestcacheApplication
        extends SpringBootServletInitializer

{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        SpringApplicationBuilder sources = application.sources(TestcacheApplication.class);
        return sources;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestcacheApplication.class, args);
    }
}
