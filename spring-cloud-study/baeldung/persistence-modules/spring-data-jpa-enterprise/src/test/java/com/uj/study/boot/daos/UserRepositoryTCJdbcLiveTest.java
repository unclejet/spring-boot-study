package com.uj.study.boot.daos;

import com.uj.study.boot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/20 上午9:01
 * @description：
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("tc-jdbc")
@SpringBootTest(classes = Application.class)
public class UserRepositoryTCJdbcLiveTest extends UserRepositoryCommon {

    @Test
    @Transactional
    public void givenUsersInDB_WhenUpdateStatusForNameModifyingQueryAnnotationNative_ThenModifyMatchingUsers() {
        insertUsers();
        int updatedUsersSize = userRepository.updateUserSetStatusForNameNativePostgres(INACTIVE_STATUS, "SAMPLE");
        assertThat(updatedUsersSize).isEqualTo(2);
    }


}
