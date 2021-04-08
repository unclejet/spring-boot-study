package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/30 上午9:13
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch32EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch32EurekaClientApplication.class, args);
    }
}
