package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/3/23 上午8:49
 * @description：
 */
@SpringBootApplication
@EnableConfigServer
public class Ch31ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ch31ConfigServerApplication.class, args);
    }
}
