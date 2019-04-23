package com.alex.platform.junit.unit.Demo2;

public class User2 {
    private String userId;
    private String name;
    private int age;

    public User2(String userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
