package com.uj.study.boot.daos.user;

import com.uj.study.boot.domain.User;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * @author ：UncleJet
 * @date ：Created in 2022/6/16 上午8:35
 * @description：
 */
public interface UserRepositoryCustom {
    List<User> findUserByEmails(Set<String> emails);

    List<User> findAllUsersByPredicates(Collection<Predicate<User>> predicates);
}
