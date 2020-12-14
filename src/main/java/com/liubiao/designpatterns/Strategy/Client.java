package com.liubiao.designpatterns.Strategy;

/**
 * 策略模式解决“鸭子问题”
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        // 北京鸭突然不能飞
        pekingDuck.setFlyBehavior(new BadFlyBehavior());
        pekingDuck.fly();
    }

}
