package com.uj.study.nacos.example.spring.boot.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
