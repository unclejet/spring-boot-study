package com.uj.study.rest;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/4 上午10:46
 * @description：
 */
public class GitHubUser {
    private String login;

    public GitHubUser() {
        super();
    }

    // API

    public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }
}
