package com.uj.study.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/17 上午9:25
 * @description：
 */
@FeignClient(name = "sc-hello-service")
public interface ConsumerService {

    @RequestMapping(value = "/helloService", method = RequestMethod.GET)
    public String getHelloServiceData();
}
