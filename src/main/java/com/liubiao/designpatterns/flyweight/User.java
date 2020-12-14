package com.liubiao.designpatterns.flyweight;

/**
 * 用户
 *
 * @author mc0710
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
