package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/7 上午9:31
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SCFeignFileServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SCFeignFileServerApplication.class, args);
    }
}
