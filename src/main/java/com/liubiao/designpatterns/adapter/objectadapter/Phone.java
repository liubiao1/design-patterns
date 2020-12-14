package com.liubiao.designpatterns.adapter.objectadapter;

/**
 * @author mc0710
 */
public class Phone {

    void charging(Voltage5V voltage5V) {
        if (voltage5V.out5V() == 5) {
            System.out.println("已适配电压5V ，可以充电");
        } else {
            System.out.println("电压不匹配，不可充电");
        }
    }

}
