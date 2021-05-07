package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/7 上午9:20
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SCFeignFileUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SCFeignFileUploadApplication.class, args);
    }
}
