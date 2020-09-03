package com.uj.study.dirtiescontext;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author ：unclejet
 * @date ：Created in 2020/9/1 下午1:33
 * @description：
 * @modified By：
 * @version:
 */
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SpringDataRestApplication.class)
@EnableWebMvc
public class DirTest {
    @Test
    void name() {

    }
}
