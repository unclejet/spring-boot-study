package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/1 上午9:31
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch33EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch33EurekaClientApplication.class, args);
    }
}
