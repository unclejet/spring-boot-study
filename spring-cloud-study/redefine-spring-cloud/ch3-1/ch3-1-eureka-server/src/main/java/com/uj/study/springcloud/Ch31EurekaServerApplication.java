package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/24 上午8:51
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch31EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch31EurekaServerApplication.class, args);
    }
}
