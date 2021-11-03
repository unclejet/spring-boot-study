package com.uj.study.gateway.customfilters.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/10/11 下午4:39
 * @description：
 */
@SpringBootApplication
@PropertySource("classpath:service-application.properties")
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
