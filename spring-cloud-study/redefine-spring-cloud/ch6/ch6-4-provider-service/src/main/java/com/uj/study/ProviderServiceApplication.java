package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/20 上午10:27
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceApplication.class, args);
    }

}
