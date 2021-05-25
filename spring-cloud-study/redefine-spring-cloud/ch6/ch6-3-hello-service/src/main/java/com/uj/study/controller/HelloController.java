package com.uj.study.controller;

import com.uj.study.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/17 上午9:13
 * @description：
 */
@RestController
public class HelloController {

    @Autowired
    private IHelloService userService;

    @GetMapping("/getProviderData")
    public List<String> getProviderData(){
        return userService.getProviderData();
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/helloService", method = RequestMethod.GET)
    public String getHelloServiceData() {
        return "hello Service";
    }
}
