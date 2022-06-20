package com.uj.study.boot.config;

import com.uj.study.boot.services.IBarService;
import com.uj.study.boot.services.impl.BarSpringDataJpaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/16 上午8:32
 * @description：
 */
@Configuration
@Profile("!tc")
@EnableTransactionManagement
@EnableJpaAuditing
public class PersistenceConfiguration {

    @Bean
    public IBarService barSpringDataJpaService() {
        return new BarSpringDataJpaService();
    }

}
