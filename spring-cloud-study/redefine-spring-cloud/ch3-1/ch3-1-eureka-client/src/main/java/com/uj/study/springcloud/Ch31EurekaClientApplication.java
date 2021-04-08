package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/24 上午8:59
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch31EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch31EurekaClientApplication.class, args);
    }
}
