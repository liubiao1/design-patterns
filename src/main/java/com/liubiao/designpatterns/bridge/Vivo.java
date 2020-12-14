package com.liubiao.designpatterns.bridge;

/**
 * Vivo 手机
 *
 * @author mc0710
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo开机了");
    }

    @Override
    public void close() {
        System.out.println("Vivo关机了");

    }

    @Override
    public void call() {
        System.out.println("Vivo在打电话");

    }
}
