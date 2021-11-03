package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/2 上午11:48
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientApp {

    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class, args);
    }
}

