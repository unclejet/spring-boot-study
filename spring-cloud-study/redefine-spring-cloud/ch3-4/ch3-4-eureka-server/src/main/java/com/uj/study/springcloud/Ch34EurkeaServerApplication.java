package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/2 上午9:07
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class Ch34EurkeaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch34EurkeaServerApplication.class, args);
    }
}
