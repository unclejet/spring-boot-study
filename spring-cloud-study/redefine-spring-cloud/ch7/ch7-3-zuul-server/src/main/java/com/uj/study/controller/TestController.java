package com.uj.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/26 上午9:38
 * @description：
 */
@RestController
public class TestController {

    @GetMapping("/client")
    public String add(Integer a, Integer b){
        return "本地跳转：" + (a + b);
    }
}
