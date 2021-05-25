package com.uj.study.controller;

import com.uj.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/13 上午9:13
 * @description：
 */
@RestController
public class TestController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam String username) throws Exception{
        return userService.getUser(username);
    }
}
