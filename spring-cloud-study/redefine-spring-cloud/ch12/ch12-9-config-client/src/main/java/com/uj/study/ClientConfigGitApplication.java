package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/9/15 上午9:23
 * @description：
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientConfigGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientConfigGitApplication.class, args);
    }
}

