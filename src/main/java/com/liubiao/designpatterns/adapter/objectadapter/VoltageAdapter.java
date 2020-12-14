package com.liubiao.designpatterns.adapter.objectadapter;

/**
 * 适配器，类似充电器
 *
 * @author mc0710
 */
public class VoltageAdapter implements Voltage5V {

    Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int out5V() {
        if (voltage220V != null) {
            int src = voltage220V.out220();
            System.out.println("对象适配器适配中~~~");
            return src / 44;
        }
        System.out.println("源电压对象为空");
        return 0;
    }
}
