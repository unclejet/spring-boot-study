package com.uj.study.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/21 上午9:41
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixCollapsingApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixCollapsingApplication.class, args);
    }

}
