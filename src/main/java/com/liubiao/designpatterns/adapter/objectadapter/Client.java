package com.liubiao.designpatterns.adapter.objectadapter;

/**
 * 对象适配器模式，解决”手机充电问题“
 * *** 就是将类适配器中 继承源电压的部分改成，将源电压聚合到适配器中。因为java是单继承，尽量用聚合等代替继承来简化代码复杂度
 *
 * @author mc0710
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }

}
