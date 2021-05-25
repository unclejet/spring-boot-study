package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/18 上午9:30
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
public class HystrixExceptionApplication{

    public static void main(String[] args) {
        SpringApplication.run(HystrixExceptionApplication.class, args);
    }


}
