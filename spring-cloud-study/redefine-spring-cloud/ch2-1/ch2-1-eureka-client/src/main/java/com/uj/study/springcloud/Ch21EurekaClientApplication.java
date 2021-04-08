package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/16 上午8:14
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch21EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch21EurekaClientApplication.class, args);
    }
}
