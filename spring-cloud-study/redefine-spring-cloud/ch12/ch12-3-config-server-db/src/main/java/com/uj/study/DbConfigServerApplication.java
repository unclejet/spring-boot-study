package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/8/4 上午9:16
 * @description：
 */
@SpringBootApplication
@EnableConfigServer
public class DbConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbConfigServerApplication.class, args);

    }
}
