package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/30 上午9:11
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch322EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch322EurekaServerApplication.class, args);
    }
}
