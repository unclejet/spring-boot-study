package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.mongodb.EnableMongoConfigServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/8/25 上午9:55
 * @description：
 */
@SpringBootApplication
@EnableMongoConfigServer
public class MongoDbConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbConfigServerApplication.class, args);
    }
}
