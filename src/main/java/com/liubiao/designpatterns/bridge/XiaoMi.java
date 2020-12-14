package com.liubiao.designpatterns.bridge;

/**
 * XiaoMi 手机
 *
 * @author mc0710
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("XiaoMi开机了");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi关机了");

    }

    @Override
    public void call() {
        System.out.println("XiaoMi在打电话");

    }
}
