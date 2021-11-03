package com.uj.study.interceptor;

import com.uj.study.vo.User;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/2 上午11:22
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
