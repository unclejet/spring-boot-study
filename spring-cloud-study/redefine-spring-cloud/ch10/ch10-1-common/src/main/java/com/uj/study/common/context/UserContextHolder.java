package com.uj.study.common.context;

import com.uj.study.common.user.User;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/7/6 上午9:25
 * @description：
 */
public class UserContextHolder {

    public static ThreadLocal<User> context = new ThreadLocal<User>();

    public static User currentUser() {
        return context.get();
    }

    public static void set(User user) {
        context.set(user);
    }

    public static void shutdown() {
        context.remove();
    }

}
