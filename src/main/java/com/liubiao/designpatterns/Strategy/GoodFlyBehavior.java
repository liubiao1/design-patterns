package com.liubiao.designpatterns.Strategy;

/**
 * @author mc0710
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("很会飞~~~");
    }
}
