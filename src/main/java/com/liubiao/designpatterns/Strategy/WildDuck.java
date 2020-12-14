package com.liubiao.designpatterns.Strategy;

/**
 * 野生鸭
 *
 * @author mc0710
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("这是一只野生鸭子");
    }
}
