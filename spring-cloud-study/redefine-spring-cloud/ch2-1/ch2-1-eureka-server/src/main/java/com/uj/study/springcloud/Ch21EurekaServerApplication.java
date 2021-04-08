package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/16 上午8:09
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch21EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch21EurekaServerApplication.class, args);
    }
}
