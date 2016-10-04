package com.courses.spalah;

/**
 * Created by Пугач Станислав on 31.07.2016.
 */
 class User {
    private String name;
    private float account;

    public User(String name, float account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public float getAccount() {
        return account;
    }

    public void setAccount(float account) {
        this.account = account;
    }
}
