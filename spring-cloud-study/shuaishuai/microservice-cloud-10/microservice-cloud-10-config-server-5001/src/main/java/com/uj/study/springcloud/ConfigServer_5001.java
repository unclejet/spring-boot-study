package com.uj.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/4/27 上午9:33
 * @description：
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer_5001 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class, args);
    }

}
