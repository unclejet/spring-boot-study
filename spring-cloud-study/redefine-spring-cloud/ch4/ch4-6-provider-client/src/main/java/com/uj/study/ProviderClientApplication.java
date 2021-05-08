package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/8 上午9:21
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderClientApplication.class, args);
    }
}
