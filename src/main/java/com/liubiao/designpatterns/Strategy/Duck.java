package com.liubiao.designpatterns.Strategy;

/**
 * 鸭子，最开始以为鸭子都是会叫会飞会游泳的，只是不同的鸭子而已
 *
 * @author mc0710
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 显示鸭子信息，不同鸭子信息不同，由子类实现
     */
    abstract void display();

    void quack() {
        System.out.println("鸭子会叫~~~~");
    }

    void swim() {
        System.out.println("鸭子会游泳~~~~");
    }

    void fly() {
        // 不同
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
