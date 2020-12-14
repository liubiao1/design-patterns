package com.liubiao.designpatterns.command;

/**
 * 电灯执行者
 *
 * @author mc0710
 */
public class LightReceiver {

    void on() {
        System.out.println("打开电灯");
    }

    void off() {
        System.out.println("关闭电灯");
    }
}
