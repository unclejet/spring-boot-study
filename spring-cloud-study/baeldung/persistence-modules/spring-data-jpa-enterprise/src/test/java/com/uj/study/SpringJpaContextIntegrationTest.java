package com.uj.study;

import com.uj.study.boot.Application;
import com.uj.study.boot.config.PersistenceConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/16 上午9:08
 * @description：
 */
@RunWith(SpringRunner.class)
//@DataJpaTest(excludeAutoConfiguration = {
//        PersistenceConfiguration.class,
//        PersistenceUserConfiguration.class,
//        PersistenceProductConfiguration.class })
@ContextConfiguration(classes = Application.class)
public class SpringJpaContextIntegrationTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
