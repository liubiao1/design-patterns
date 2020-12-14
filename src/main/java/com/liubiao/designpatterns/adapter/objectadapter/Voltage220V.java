package com.liubiao.designpatterns.adapter.objectadapter;

/**
 * 源电压
 *
 * @author mc0710
 */
public class Voltage220V {

    int out220() {
        int src = 220;
        System.out.println(src + "V 电压~~~");
        return src;
    }

}
