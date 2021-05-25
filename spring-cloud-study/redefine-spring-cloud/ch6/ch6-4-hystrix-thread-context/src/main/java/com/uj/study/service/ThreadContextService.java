package com.uj.study.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.uj.study.config.HystrixThreadLocal;
import com.uj.study.controller.ThreadContextController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/24 上午9:34
 * @description：
 */
@Component
public class ThreadContextService implements IThreadContextService{
    private static final Logger log = LoggerFactory.getLogger(ThreadContextController.class);
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand
    public String getUser(Integer id) {
        log.info("ThreadContextService, Current thread : " + Thread.currentThread().getId());
        log.info("ThreadContextService, ThreadContext object : " + HystrixThreadLocal.threadLocal.get());
        log.info("ThreadContextService, RequestContextHolder : " + RequestContextHolder.currentRequestAttributes().getAttribute("userId", RequestAttributes.SCOPE_REQUEST).toString());
        String json = restTemplate.getForObject("http://sc-provider-service/getUser/{1}", String.class, id);
        return json;
//        return "Success";
    }



}

