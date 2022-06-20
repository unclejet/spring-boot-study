package com.uj.study.boot.daos;

import com.uj.study.boot.daos.user.UserRepository;
import com.uj.study.boot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/17 上午9:19
 * @description：
 */
public class UserRepositoryCommon {
    final String USER_EMAIL = "email@example.com";
    final String USER_EMAIL2 = "email2@example.com";
    final String USER_EMAIL3 = "email3@example.com";
    final String USER_EMAIL4 = "email4@example.com";
    final Integer INACTIVE_STATUS = 0;
    final Integer ACTIVE_STATUS = 1;
    final String USER_EMAIL5 = "email5@example.com";
    final String USER_EMAIL6 = "email6@example.com";
    final String USER_NAME_ADAM = "Adam";
    final String USER_NAME_PETER = "Peter";

    @Autowired
    protected UserRepository userRepository;

    protected void insertUsers() {
        userRepository.save(new User("SAMPLE", LocalDate.now(), USER_EMAIL, ACTIVE_STATUS));
        userRepository.save(new User("SAMPLE1", LocalDate.now(), USER_EMAIL2, ACTIVE_STATUS));
        userRepository.save(new User("SAMPLE", LocalDate.now(), USER_EMAIL3, ACTIVE_STATUS));
        userRepository.save(new User("SAMPLE3", LocalDate.now(), USER_EMAIL4, ACTIVE_STATUS));
        userRepository.flush();
    }
}
