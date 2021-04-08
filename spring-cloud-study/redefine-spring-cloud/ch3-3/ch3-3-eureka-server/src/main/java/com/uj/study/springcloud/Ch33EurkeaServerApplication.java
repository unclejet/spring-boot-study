package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/1 上午9:23
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch33EurkeaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch33EurkeaServerApplication.class, args);
    }
}
