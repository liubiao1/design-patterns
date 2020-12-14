package com.liubiao.designpatterns.Strategy;

/**
 * 玩具鸭子
 * <p>
 * * @author mc0710
 */
public class ToyDuck extends Duck{

    public ToyDuck() {
        // 玩具鸭不会飞
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("这是玩具鸭子");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }
}
