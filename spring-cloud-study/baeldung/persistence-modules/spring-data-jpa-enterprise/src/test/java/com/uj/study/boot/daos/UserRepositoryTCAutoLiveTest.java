package com.uj.study.boot.daos;

import com.uj.study.boot.Application;
import com.uj.study.boot.domain.User;
import com.uj.study.util.BaeldungPostgresqlContainer;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.containers.PostgreSQLContainer;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/20 上午9:12
 * @description：
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles({"tc", "tc-auto"})
public class UserRepositoryTCAutoLiveTest extends UserRepositoryCommon {

    @ClassRule
    public static PostgreSQLContainer<BaeldungPostgresqlContainer> postgreSQLContainer = BaeldungPostgresqlContainer.getInstance();

    @Test
    @Transactional
    public void givenUsersInDB_WhenUpdateStatusForNameModifyingQueryAnnotationNativePostgres_ThenModifyMatchingUsers() {
        insertUsers();
        int updatedUsersSize = userRepository.updateUserSetStatusForNameNativePostgres(INACTIVE_STATUS, "SAMPLE");
        assertThat(updatedUsersSize).isEqualTo(2);
    }
}

