package com.uj.study.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/15 上午8:58
 * @description：
 */
@SpringBootApplication
@EnableJpaRepositories("com.uj.study.boot")
@EntityScan("com.uj.study.boot")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
