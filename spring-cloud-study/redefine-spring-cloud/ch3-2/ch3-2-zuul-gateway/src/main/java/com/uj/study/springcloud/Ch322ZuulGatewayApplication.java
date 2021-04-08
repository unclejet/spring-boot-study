package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/30 上午9:17
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Ch322ZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch322ZuulGatewayApplication.class, args);
    }
}
