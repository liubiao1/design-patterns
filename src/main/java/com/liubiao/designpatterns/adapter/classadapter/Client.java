package com.liubiao.designpatterns.adapter.classadapter;

/**
 * 类适配器模式，解决”手机充电问题“
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

}
