package com.uj.study.controller;

import com.uj.study.interceptor.UserContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/2 上午11:39
 * @description：
 */
@RestController
public class ProviderController {

    @GetMapping("/provider/test")
    public String test(HttpServletRequest request) {
        System.out.println("auth success, the user is : " + UserContextHolder.currentUser().getUserName());
        System.out.println("----------------success access provider service----------------");
        return "success access provider service!";
    }
}

