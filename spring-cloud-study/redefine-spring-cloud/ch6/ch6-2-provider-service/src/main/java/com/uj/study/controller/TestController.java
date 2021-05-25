package com.uj.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/14 上午9:38
 * @description：
 */
@RestController
public class TestController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(@RequestParam("username") String username) throws Exception{
        if(username.equals("spring")) {
            return "This is real user";
        }else {
            throw new Exception();
        }
    }

    @GetMapping("/getDashboard")
    public List<String> getProviderData(){
        List<String> provider = new ArrayList<String>();
        provider.add("hystrix dashboard");
        return provider;
    }


    @GetMapping("/getHelloService")
    public String getHelloService(){
        return consumerService.getHelloServiceData();
    }
}

