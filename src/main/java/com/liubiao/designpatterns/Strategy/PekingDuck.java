package com.liubiao.designpatterns.Strategy;

public class PekingDuck extends Duck {


    public PekingDuck() {
        // 北京鸭子好会飞
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("北京鸭~~~");
    }
}
