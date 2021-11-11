package com.uj.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RefreshScope
public class ConfigController {

    @Value("${api.order.version:-1}")
    private String apiVersion;

    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/version")
    public String get() {
        return apiVersion;
    }
}
