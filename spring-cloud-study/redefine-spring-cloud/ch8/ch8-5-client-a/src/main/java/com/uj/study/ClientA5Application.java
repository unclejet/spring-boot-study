package com.uj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/6/15 上午9:43
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientA5Application {
    //--spring.profiles.active=node1，每次启动将node1改为node2或node3，就能启动多个服务实例
    public static void main(String[] args) {
        String[] s = {"--spring.profiles.active=node3", "--server.port=7072"};
        SpringApplication.run(ClientA5Application.class, s);
    }
}
