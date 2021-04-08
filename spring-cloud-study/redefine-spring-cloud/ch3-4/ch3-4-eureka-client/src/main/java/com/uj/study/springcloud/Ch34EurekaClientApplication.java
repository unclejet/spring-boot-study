package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/2 上午9:16
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch34EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch34EurekaClientApplication.class, args);
    }
}
