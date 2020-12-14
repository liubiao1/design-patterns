package com.liubiao.designpatterns.facade;

/**
 * @author mc0710
 */
public class Popcorn {

    /**
     * 饿汉式
     */
    private static Popcorn instencePopcorn = new Popcorn();

    public static Popcorn getInPopcorn() {
        return instencePopcorn;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn ff ");
    }

    public void pop() {
        System.out.println(" popcorn is poping ");
    }

}

