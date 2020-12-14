package com.liubiao.designpatterns.adapter.classadapter;

/**
 * 适配器，类似充电器
 *
 * @author mc0710
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int out5V() {
        int src = out220();
        return src / 44;
    }
}
