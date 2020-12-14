package com.liubiao.designpatterns.Strategy;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不太会飞~~~");
    }
}
