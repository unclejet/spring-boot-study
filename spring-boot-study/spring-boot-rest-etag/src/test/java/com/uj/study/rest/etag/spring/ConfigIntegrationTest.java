package com.uj.study.rest.etag.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.uj.study.rest.etag.test")
public class ConfigIntegrationTest implements WebMvcConfigurer {

    public ConfigIntegrationTest() {
        super();
    }

    // API

}