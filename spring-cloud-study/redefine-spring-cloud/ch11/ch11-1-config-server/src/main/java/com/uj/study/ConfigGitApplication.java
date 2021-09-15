package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/7/21 上午10:38
 * @description：
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigGitApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigGitApplication.class, args);
    }
}
