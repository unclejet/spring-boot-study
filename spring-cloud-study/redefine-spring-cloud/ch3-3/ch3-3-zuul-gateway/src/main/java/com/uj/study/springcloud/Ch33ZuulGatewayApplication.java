package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/1 上午9:33
 * @description：
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class Ch33ZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch33ZuulGatewayApplication.class, args);
    }
}
