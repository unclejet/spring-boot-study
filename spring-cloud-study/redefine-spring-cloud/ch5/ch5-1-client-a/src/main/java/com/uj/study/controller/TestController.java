package com.uj.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/10 上午9:09
 * @description：
 */
@RestController
public class TestController {
    @GetMapping("/add")
    public String add(Integer a, Integer b, HttpServletRequest request){
        return " From Port: "+ request.getServerPort() + ", Result: " + (a + b);
    }
}