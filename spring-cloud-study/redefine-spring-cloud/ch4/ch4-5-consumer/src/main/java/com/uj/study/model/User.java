package com.uj.study.model;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/5/6 上午9:21
 * @description：
 */
public class User {

    private Long id;
    private String name;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
