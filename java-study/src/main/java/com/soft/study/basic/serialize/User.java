package com.soft.study.basic.serialize;

import java.io.Serializable;

/**
 * @description: 用户类
 * @author: crq
 * @create: 2021-11-19 08:04
 **/
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
